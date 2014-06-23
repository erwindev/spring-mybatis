package com.erwindev.job;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.erwindev.job.process.Process;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args){
		if (args.length == 0) {
			System.out.println("Usage: java Batch 'bean id'");
			return;
		}		
		context = new ClassPathXmlApplicationContext("app-config.xml");
 
		Process obj = (Process) context.getBean(args[0]);
		
		try {
			obj.setArgs(args);
			obj.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
