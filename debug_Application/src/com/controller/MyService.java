package com.controller;

public class MyService {

	public MyService() {
		// TODO Auto-generated constructor stub
	}
	
	public void storeResultProcess(MyController controller){
		System.out.println("pitambar");
		System.out.println(controller.age);
		System.out.println(controller.name);
		controller.name="ramachandra";
	}

}
