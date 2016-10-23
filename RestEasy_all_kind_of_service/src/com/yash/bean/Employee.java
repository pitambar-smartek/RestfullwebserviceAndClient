package com.yash.bean;

public class Employee {
	private String name;
	private String Address;
	private int age;
	private long salary;
	private String id;

	public Employee() {

	}

	public Employee(String name, String address, int age, long salary, String id) {
		this.name = name;
		this.Address = address;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Address=" + Address + ", age="
				+ age + ", salary=" + salary + ", id=" + id + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
