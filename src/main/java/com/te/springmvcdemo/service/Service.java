package com.te.springmvcdemo.service;

import com.te.springmvcdemo.bean.EmployeeBean;
import com.te.springmvcdemo.dao.EmployeeDao;

public class Service implements Impleservice{
 
	EmployeeDao dao;
	
	@Override
	public EmployeeBean authenticate(int id, String password) {
		
		return dao.authenticate(id, password);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		return dao.getEmployee(id);
	}

	@Override
	public boolean deleteEmpData(int id) {
		
		return dao.deleteEmpData(id);
	}

}
