package com.cdc.mitrais.springbootdemoone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdc.mitrais.springbootdemoone.controller.PersonController;
import com.cdc.mitrais.springbootdemoone.model.Person;

@Transactional
@Repository
public class PersonDAO implements IPersonDAO{

	@PersistenceContext	
	private EntityManager entityManager;	
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllData() {
		String hql = "FROM Person as atcl ORDER BY atcl.id";
		List<Person> data = entityManager.createQuery(hql).getResultList();
		for(Person person : data) {
			System.out.println("Person Data:"+ person.getFirstName());
			logger.debug("Person Data From PersonDAO:"+ person.getFirstName());
		}
		return data;
	}

	

	@Override
	public void addData(Person data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData(Person data) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isDataExists(String title, String category) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Person getDataById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteData(int Id) {
		// TODO Auto-generated method stub
		
	}

}
