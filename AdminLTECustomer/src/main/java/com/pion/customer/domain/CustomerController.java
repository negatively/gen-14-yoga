package com.pion.customer.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	@GetMapping(value={"/customer","/"})
	public String home(Model m) {
		return "index";

	}
	
	@GetMapping(value="/sales")
	public String salesTable(Model m) {
		return "sales";

	}
	
	@GetMapping(value="/produk")
	public String produkTable(Model m) {
		return "produk";

	}
	
	
}
