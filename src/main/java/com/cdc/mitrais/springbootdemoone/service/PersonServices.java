package com.cdc.mitrais.springbootdemoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdc.mitrais.springbootdemoone.dao.IPersonDAO;
import com.cdc.mitrais.springbootdemoone.model.Person;

@Service
public class PersonServices implements IPersonService{

	@Autowired
	IPersonDAO personDAO;
	
	@Override
	public List<Person> getAllData() {
		return personDAO.getAllData();
	}

	@Override
	public Person getDataById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addData(Person data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateData(Person data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData(int Id) {
		// TODO Auto-generated method stub
		
	}

}
