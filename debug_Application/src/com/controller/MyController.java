package com.controller;

public class MyController {
	int age;
	String name;
	//MyController controller=null;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyController controller=new MyController(); 
          controller.age=44;
          controller.name="pita";
          controller.callServiceMethod(controller);
          
	}
	
	public void callServiceMethod(MyController controller){
		MyService service=new MyService();
		controller.age=28;
		service.storeResultProcess(controller);
		
	}

}
