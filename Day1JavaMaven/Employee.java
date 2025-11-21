package com.example.Day1JavaMaven;

public class Employee {

	private String empName;
	private int empId;
	private String desg;
	private String mobileNumber;
	
	public Employee(String empName, int empId, String desg, String mobileNumber) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.desg = desg;
		this.mobileNumber = mobileNumber;
	}
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", desg=" + desg + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
}
