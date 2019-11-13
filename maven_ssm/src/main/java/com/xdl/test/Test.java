package com.xdl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xdl.service.BankAccountService;

public class Test {
public static void main(String[] args) {
	ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
	BankAccountService bankAccountService = (BankAccountService)app.getBean("bankService");
	System.out.println(bankAccountService.login("aa", "aa"));
	}
}
