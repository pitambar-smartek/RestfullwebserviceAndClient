package com.controller;


	public class HelloWorld extends Test{
	    
        public void myTest(int age){
          age = 10;
         System.out.println("Overrided::::"+age);
        // return age;
       }
        
        static public void main(String []args){
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        hw.myTest(14);
      }
}
 
class Test{
     
        public void myTest(String age){
            System.out.println("Inside 1st::"+age);
        }
        public void myTest(int age){
            System.out.println("Inside 2nd::"+age);
        }
     
 }