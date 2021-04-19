package com.te.springmvcdemo.dao;

import com.te.springmvcdemo.bean.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean authenticate(int id,String password);
    
public EmployeeBean getEmployee(int id);
public boolean deleteEmpData(int id);
}
