package com.daun.customer.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RestCustController {

	@Autowired
	private CustomerService crudService;

	@GetMapping("/companyList")
	public ResponseEntity<List<Customer>> getCompanyList() {
		return new ResponseEntity<List<Customer>>(crudService.getCompanyList(), HttpStatus.OK);
	}

	@GetMapping("/company/{id}")
	public ResponseEntity<Customer> getCompany(@PathVariable Integer id) {
		return new ResponseEntity<Customer>(crudService.getCompanyById(id), HttpStatus.OK);
	}

	@PostMapping("/company/save")
	public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Customer company) {
		crudService.saveOrUpdateCompany(company);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/company/delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable Integer id) {
		crudService.deleteCompany(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}