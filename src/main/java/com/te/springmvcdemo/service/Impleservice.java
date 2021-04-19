package com.te.springmvcdemo.service;

import com.te.springmvcdemo.bean.EmployeeBean;

public interface Impleservice {
	public EmployeeBean authenticate(int id,String password);
    
	public EmployeeBean getEmployee(int id);
	public boolean deleteEmpData(int id);

}
