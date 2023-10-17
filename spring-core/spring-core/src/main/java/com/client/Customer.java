package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.GuestService;
import com.service.InsuranceService;

import insuranceModel.Account;

public class Customer {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("BeanAcc.xml");
		Account acc1 = (Account)ctx.getBean("current");
		Account acc2 = (Account)ctx.getBean("savings");
		System.out.println(acc1);
		System.out.println(acc2);
		ctx.close();
	}

}
