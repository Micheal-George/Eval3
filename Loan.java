package com.Eval3;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		double Loanamount;
		if(employeeObj!=null)
		{
			if(employeeObj instanceof PermanentEmployee)
			{
				Loanamount=employeeObj.getSalary()*0.15;
				return Loanamount;	
			}
			if(employeeObj instanceof TemporaryEmployee)
			{
				Loanamount=employeeObj.getSalary()*0.10;
				return Loanamount;	
			}
		}
		
			return 0;	
		
	}

	public static void main(String[] args) {
		
		Loan l=new Loan();
		TemporaryEmployee T=new TemporaryEmployee(123,"sam" , 8, 100);
		PermanentEmployee P=new PermanentEmployee(123, "Mike", 10000);
		System.out.println(P.getSalary());;
		l.calculateLoanAmount(T);
	}

}
