package com.Eval3;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	@Override
	void calculateSalary() {
		double amount=(double)(basicPay-(basicPay*0.8));
		Employee E=new Employee(employeeId, employeeName);
		E.setSalary(amount);
		this.salary=amount;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		PermanentEmployee P=new PermanentEmployee(123, "sfgsfg", 10000);
	P.calculateSalary();
	}

}
