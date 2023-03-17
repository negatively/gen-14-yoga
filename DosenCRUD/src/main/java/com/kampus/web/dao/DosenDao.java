package com.kampus.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kampus.web.model.Dosen;

public class DosenDao {


	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/datakampus", "postgres","root");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public Dosen getDosen(String kodeDsn) throws SQLException {
		Dosen d = new Dosen();
		d.setKodeDsn("No Data");
		d.setNameDsn("No Data");
		String query = "select * from dosen where kode_dosen=?";

		try {
			Connection conn = DosenDao.getConnection();
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, kodeDsn);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				d.setKodeDsn(rs.getString("kode_dosen"));
				d.setNameDsn(rs.getString("nama"));
			}
			rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public void update(String kodeDsn, String nameDsn) {
		String query = "update dosen set nama = ? where kode_dosen=?";

		try {
			Connection conn = DosenDao.getConnection();
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, nameDsn);
			st.setString(2, kodeDsn);
			st.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void create(String kodeDsn, String nameDsn) {
		String query = "insert into dosen(kode_dosen, nama) values (?,?)";

		try {
			Connection conn = DosenDao.getConnection();
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, kodeDsn);
			st.setString(2, nameDsn);
			st.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String kodeDsn) {
		String query = "delete from dosen where kode_dosen = ?";

		try {
			Connection conn = DosenDao.getConnection();
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, kodeDsn);
			st.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Dosen> getAllData(){
		List<Dosen> listDosen = new ArrayList<Dosen>();
		String query = "select * from dosen";
		
		try {
			Connection conn = DosenDao.getConnection();
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Dosen ds = new Dosen();
				ds.setKodeDsn(rs.getString("kode_dosen"));
				ds.setNameDsn(rs.getString("nama"));
				listDosen.add(ds);
			}
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listDosen;
		
	}
}
