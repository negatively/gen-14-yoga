package com.pion.customer.domain;

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
	private CustomerService service;

	@GetMapping("/customerList")
	public ResponseEntity<List<Customer>> getCustomerList() {
		return new ResponseEntity<List<Customer>>(service.listAll(), HttpStatus.OK);
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
		return new ResponseEntity<Customer>(service.get(id), HttpStatus.OK);
	}

	@PostMapping("/customer/save")
	public ResponseEntity<Void> saveOrUpdateCustomer(@RequestBody Customer customer) {
		service.save(customer);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/customer/delete/{id}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}