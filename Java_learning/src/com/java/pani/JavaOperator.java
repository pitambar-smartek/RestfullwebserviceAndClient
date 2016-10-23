package com.java.pani;

public class JavaOperator {
	
	/*
	 * static varible
	 * non static
	 * final 
	 * local variable
	 * transient variable
	 * volative variable
	 */
	 int age;
	 
	 static int id;

	public JavaOperator() {
		System.out.println("Default constructor");
	}
	
	{//non static block
		System.out.println("non static block executed");
	}
	
	static {
		System.out.println( "Before main is executed");
	}
	

	public JavaOperator(int ag) {
		super();
		age = ag;
		System.out.println("parameterised constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("before  object created");
         JavaOperator operator=new JavaOperator();
         
         System.out.println("after object created");
         System.out.println("age="+operator.age +" id="+id);
         
         JavaOperator operator2=new JavaOperator(28);
         System.out.println("object created");
         System.out.println("age="+operator2.age);
         
	}
	public void myMethod(){
		JavaOperator operator3=new JavaOperator();
	}

}

