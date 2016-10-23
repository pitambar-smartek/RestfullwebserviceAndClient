package com.pita;

import java.util.HashSet;

public class SetDemo {

	public SetDemo() {
	}

	public static void main(String[] args) {
			EmployeeOne emp=new EmployeeOne(21,"pita",101);
			EmployeeOne emp1=new EmployeeOne(26,"damo",102);
			EmployeeOne emp2=new EmployeeOne(51,"Ramesh",103);
			EmployeeOne emp3=new EmployeeOne(11,"krishna",104);
			EmployeeOne emp4=new EmployeeOne(19,"bishnu",105);
			EmployeeOne emp5=new EmployeeOne(21,"pita",106);
			
			HashSet<EmployeeOne> hashSet= new HashSet();
			hashSet.add(emp1);
			hashSet.add(emp2);
			hashSet.add(emp3);
			hashSet.add(emp4);
			System.out.println("size="+hashSet.size());

	}

}

class EmployeeOne {
	EmployeeOne (int age,String name,int empId){
		this.age= age;
		this.name=name;
		this.empId=empId;
	}
	String name;
	
	int age;
	int empId;
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeOne other = (EmployeeOne) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}

