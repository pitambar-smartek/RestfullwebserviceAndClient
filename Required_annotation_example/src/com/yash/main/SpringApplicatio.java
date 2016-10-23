package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.beans.CustomerBean;
import com.yash.beans.ScopeAnnotationExample;

public class SpringApplicatio {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		CustomerBean custBean = (CustomerBean) context.getBean("customerBean");

		System.out.println("The customer details=" + custBean);
		
		ScopeAnnotationExample  annotationExample=(ScopeAnnotationExample) context.getBean("rama");
	
	  System.out.println("the output="+annotationExample.getMessage());
	}

}
