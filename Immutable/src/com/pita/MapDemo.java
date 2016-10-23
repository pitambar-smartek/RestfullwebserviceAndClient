package com.pita;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

		public static void main(String[] args){
			Employee emp=new Employee(21,"pita",101);
			Employee emp1=new Employee(26,"damo",102);
			Employee emp2=new Employee(51,"Ramesh",103);
			Employee emp3=new Employee(11,"krishna",104);
			Employee emp4=new Employee(19,"bishnu",105);
			Employee emp5=new Employee(21,"pita",106);
		HashMap<Employee,String> hashMap=new HashMap<>();
		hashMap.put(emp1, "It departement");
		hashMap.put(emp2, "HR department");
		hashMap.put(emp3, "Maintaince department");
		hashMap.put(emp5, "Account Department");
		hashMap.put(emp4, "fjdkfjdkfjdkjdk");
		
		System.out.println("size of hashMap="+hashMap.size());
		
		for(Entry entry:hashMap.entrySet()){
			System.out.println(entry.getKey()+"    value  "+entry.getValue());
		}
		}
		


}

class Employee {
	Employee (int age,String name,int empId){
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
		Employee other = (Employee) obj;
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
