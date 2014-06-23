package com.erwindev.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.erwindev.job.model.Customer;

public interface CustomerDao {

	@Select("SELECT * FROM customer WHERE ID = #{id}")
	public Customer getCustomer(@Param("id") long id);
	
	@Select("SELECT * FROM customer")
	public List<Customer> getAllCustomers();	
	
	@Insert("INSERT INTO customer (name, created_date) values (#{name}, #{createdDate})")
	public void insert(Customer customer);
	
	@Update("UPDATE customer set name = #{name} where id = #{id}")
	public void update(Customer customer);	
	
	@Delete("DELETE FROM customer where id = #{id})")
	public void delete(Customer customer);		
	
}
