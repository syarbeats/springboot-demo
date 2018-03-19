package com.cdc.mitrais.springbootdemoone.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdc.mitrais.springbootdemoone.model.Article;
import com.cdc.mitrais.springbootdemoone.model.Person;
import com.cdc.mitrais.springbootdemoone.service.IPersonService;

@Controller
@RequestMapping("user")
public class PersonController {

	@Autowired
	IPersonService personService;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@GetMapping("persons")
	public ResponseEntity<List<Person>> getAllPersons() {
		List<Person> list = personService.getAllData();
		logger.debug("PERSON-Controller-url(/user/persons): GetAllData()");
		logger.info("PERSON-Controller-url(/user/persons): GetAllData()");
		
		for(Person person : list) {
			logger.debug("Person Data:"+ person.getFirstName());
			logger.info("Person Data:"+ person.getFirstName());
		}
		
		return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
	}
	
	@GetMapping("person/{id}")
	public ResponseEntity<Person> getPersonById(@PathVariable("id") Integer id) {
		Person person = personService.getDataById(id);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	@GetMapping("person-data")
	public ResponseEntity<Person> getPersonByIdUsingQueryParam(@RequestParam("id") Integer id) {
		Person person = personService.getDataById(id);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
}
