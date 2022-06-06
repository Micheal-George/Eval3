package com.Eval3;

public class Customer {
	
	
	String username; 
	String password;
	String mobileNumber;
	String email;
	
	public Customer(String username,String password,String mobileNumber,String email) {
		this.username=username;
		this.password=password;
		this.mobileNumber=mobileNumber;
		this.email=email;
	}
	
	void showDetails() {
		System.out.println(" username "+username);
		System.out.println(" password "+password);
		System.out.println(" mobileNumber "+mobileNumber);
		System.out.println(" email "+email);
	}

}
