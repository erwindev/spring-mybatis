package com.erwindev.job.process.customer;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.erwindev.job.dao.CustomerDao;
import com.erwindev.job.model.Customer;
import com.erwindev.job.process.ProcessImpl;

public class CustomerProcess extends ProcessImpl{

	@Autowired
	CustomerDao customerDao;
	
	public void execute() throws Exception {
		List<Customer> customers = customerDao.getAllCustomers();
		
		for (Iterator<Customer> iter = customers.iterator(); iter.hasNext();){
			Customer c = iter.next();
			System.out.println(c);
		}
	}

}
