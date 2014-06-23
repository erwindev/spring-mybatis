package test.erwindev.job.dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.erwindev.job.dao.CustomerDao;
import com.erwindev.job.model.Customer;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/app-config.xml")
public class CustomerDaoTest {
	private static Log log = LogFactory.getLog(CustomerDaoTest.class);
	
	@Autowired
	private CustomerDao customerDao;
	
	@Test
	public void testInsertCustomer(){
		log.info("testing testInsertCustomer()...");
		
		Customer customer = new Customer();
		customer.setCreatedDate(new Date());
		customer.setName("Kobe Bryant");
		
		customerDao.insert(customer);
		
		List<Customer> customers = customerDao.getAllCustomers();		
		assertTrue("failure - customers is null", customers.size() > 0);
	}	
	
	@Test
	public void testUpdateCustomer(){
		log.info("testing testUpdateCustomer()...");
		
		Customer customer = customerDao.getCustomer(1);
		System.out.println(customer);
		
		customer.setName("Jake Ballard");
		
		customerDao.update(customer);
		
		customer = customerDao.getCustomer(1);

		assertTrue("failure - customers is not update", customer.getName().equals("Jake Ballard"));
	}	
		
	
	@Test
	public void testGetAllCustomers(){
		log.info("testing testGetAllCustomers()...");
		List<Customer> customers = customerDao.getAllCustomers();
		
		for (Iterator<Customer> iter = customers.iterator(); iter.hasNext();){
			Customer c = iter.next();
			System.out.println(c);
		}
		
		assertTrue("failure - customers is null", customers.size() > 0);
	}	
		
}
