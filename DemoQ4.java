package com.Eval3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DemoQ4 {
	
	
	public void details(String username,String password,String mobileNumber,String email)
	{
		if(Pattern.matches("[a-zA-Z]{3,8}",username))
		{
			if(Pattern.matches("[a-zA-Z0-9]{3,8}",password))
			{
				if(Pattern.matches("[6789]{1}[0-9]{9}",mobileNumber))
				{
					if(Pattern.matches("[[a-zA-Z0-9]]{10,20}",email))
					{
						Customer c= new Customer(username,password, mobileNumber,email);
						c.showDetails();	
					}
					else
						System.out.println("enter valid email ");
				}
				else
					System.out.println("enter valid Mobile NUmber ");
			}
			else
				System.out.println("enter valid Password ");
		}
		else
			System.out.println("enter valid User Name ");
	
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName :");
		String name=sc.next();
		System.out.println("Enter Password :");
		String pass=sc.next();
		System.out.println("Enter Mobile Number :");
		String Mnum=sc.next();
		System.out.println("Enter Email :");
		String email=sc.next();
		
      DemoQ4 D=new DemoQ4();
      D.details(name, pass, Mnum, email);
		
		
			
		
		
	}	
	

}