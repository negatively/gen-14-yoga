package com.kampus.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kampus.web.dao.DosenDao;
import com.kampus.web.model.Dosen;

@WebServlet("/")
public class DosenController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getServletPath();

		try {
			switch (command) {
			case "/createDosen":
				createData(request, response);
				break;
			case "/updateDosen":
				updateData(request, response);
				break;
			case "/deleteDosen":
				deleteData(request, response);
				break;
			case "/showUpdateDosen":
				showUpdateData(request, response);
				break;
			default:
				allData(request, response);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void allData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DosenDao dao = new DosenDao();

		List<Dosen> allDosen = new ArrayList<Dosen>();
		allDosen = dao.getAllData();
		request.setAttribute("dosens", allDosen);

		RequestDispatcher rd = request.getRequestDispatcher("showDosen.jsp");
		rd.forward(request, response);
	}

	protected void createData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kodeDsn = request.getParameter("kodeDsn");
		String nameDsn = request.getParameter("nameDsn");

		DosenDao dao = new DosenDao();
		dao.create(kodeDsn, nameDsn);
		response.sendRedirect("./");
	}

	protected void updateData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kodeDsn = request.getParameter("kodeDsn");
		String nameDsn = request.getParameter("nameDsn");
		
		DosenDao dao = new DosenDao();
		dao.update(kodeDsn, nameDsn);
		response.sendRedirect("./");

	}

	protected void deleteData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kodeDsn = request.getParameter("kodeDsn");

		DosenDao dao = new DosenDao();
		dao.delete(kodeDsn);
		response.sendRedirect("./");

	}

	protected void showUpdateData(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kodeDsn = request.getParameter("kodeDsn");

		DosenDao dao = new DosenDao();
		Dosen d1 = new Dosen();
		try {
			d1 = dao.getDosen(kodeDsn);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("dosen", d1);

		RequestDispatcher rd = request.getRequestDispatcher("updateDosen.jsp");
		rd.forward(request, response);
	}
}
