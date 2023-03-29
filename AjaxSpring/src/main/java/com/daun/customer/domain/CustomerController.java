package com.daun.customer.domain;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	@GetMapping(value={"/customer","/"})
	public String home(Model m) {
		return "customer";

	}
}
