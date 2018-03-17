package com.cdc.mitrais.springbootdemoone.service;

import java.util.List;

import com.cdc.mitrais.springbootdemoone.model.Person;

public interface IPersonService {
	List<Person> getAllData();
    Person getDataById(int Id);
    boolean addData(Person data);
    void updateData(Person data);
    void deleteData(int Id);
}
