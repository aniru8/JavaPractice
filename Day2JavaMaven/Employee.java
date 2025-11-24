package com.example.Day2JavaMaven;

//sort employees salary array using lambda
public class Employee {
	
	private String empName;
	private int empId;
	private long salary;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public Employee(String empName, int empId, long salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "empName=" + empName + ", salary=" + salary;
	}
	
	
	
}
