package com.cdc.mitrais.springbootdemoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cdc.mitrais.springbootdemoone.model.Person;
import com.cdc.mitrais.springbootdemoone.service.IPersonService;

@Controller
@RequestMapping("user")
public class PersonController {

	@Autowired
	IPersonService personService;
	
	@GetMapping("persons")
	public ResponseEntity<List<Person>> getAllPersons() {
		List<Person> list = personService.getAllData();
		
		for(Person person : list) {
			System.out.println("Person Data:"+ person.getFirstName());
		}
		
		return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
	}
}
