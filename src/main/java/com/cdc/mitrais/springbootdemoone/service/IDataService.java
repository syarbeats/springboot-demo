package com.cdc.mitrais.springbootdemoone.service;

import java.util.List;

public interface IDataService<T,U> {
	List<T> getAllData();
    T getDataById(U Id);
    boolean addData(T data);
    void updateData(T data);
    void deleteData(U Id);
}
