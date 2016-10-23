package com.pita;

import java.util.ArrayList;

public final class Immutable {
	private final String name;
	private final int age;
	private static final ArrayList<String> arrayList =new ArrayList();
	

	public Immutable(String name,int age,ArrayList<String> st) {
		this.name=name;
		this.age=age;

		arrayList.add("pita");
		arrayList.add("pita");
		arrayList.add("pita");
		arrayList.add("pita");
		
		
		
	}
	

	public static void main(String[] args) {
		
System.out.println("pitambar");
   Immutable immutable=new Immutable("pita", 21,new ArrayList<String>());
  immutable.getArrayList().add("ravan");
  System.out.println(immutable.getArrayList().size());
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public ArrayList<String> getArrayList() {
		return arrayList;
	}

}
