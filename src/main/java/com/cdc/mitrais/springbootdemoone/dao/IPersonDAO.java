package com.cdc.mitrais.springbootdemoone.dao;

import java.util.List;

import com.cdc.mitrais.springbootdemoone.model.Person;

public interface IPersonDAO {
	 List<Person> getAllData();
	 Person getDataById(int id);
	 void addData(Person person);
	 void updateData(Person person);
	 void deleteData(int id);
	 boolean isDataExists(String title, String category);
}
