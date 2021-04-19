package com.te.springmvcdemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvcdemo.bean.EmployeeBean;

@Repository
public class EmployeeImplement implements EmployeeDao {

	public EmployeeBean authenticate(int id, String pwd) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Data");
		EntityManager manager = factory.createEntityManager();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		if (bean != null) {

			if (bean.getPassword().equals(pwd)) {
				System.out.println("Sucessfull");
				return bean;
			} else {
				System.out.println("Invalid");
				return null;
			}
		} else {
			System.out.println("user not found");
			return null;
		}

	}

	public EmployeeBean getEmployee(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Data");
		EntityManager manager = factory.createEntityManager();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		if (bean != null) {

			System.out.println("Sucessfull");
			return bean;

		} else {
			System.out.println("user not found");
			return null;
		}

	}

	public boolean deleteEmpData(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Data");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		manager.remove(bean);
		transaction.commit();
		if (bean != null) {

			System.out.println("Deleted Sucessfull");
			return true;

		} else {
			System.out.println("Deleted not Sucessfull");
			return false;
		}

	}
	}

