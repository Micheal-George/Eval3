package com.Eval3;

public class TemporaryEmployee extends Employee {

	
	private int hoursWorked;
	private int  hourlyWages;
	
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	void calculateSalary() {
		double salary= hoursWorked * hourlyWages;
		this.salary=salary;
		setSalary(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
