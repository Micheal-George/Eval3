package com.Eval3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) {
		switch(m) {
		case JAN :
			{System.out.println("This is the 1st Month of the Year January");
			break;}
			
		case FEB :
		{System.out.println("This is the 2st Month of the Year February");
		break;}
		
		case MAR :
		{System.out.println("This is the 3rd Month of the Year March");
		break;}
		
		case APR :
		{System.out.println("This is the 4th Month of the Year April");
		break;}
		
		case MAY :
		{System.out.println("This is the 5th Month of the Year May");
		break;}
		case JUN :
		{System.out.println("This is the 6th Month of the Year June");
		break;}
		
		case JUL :
		{System.out.println("This is the 7th Month of the Year July");
		break;}
		
		case AUG :
		{System.out.println("This is the 8th Month of the Year  August");
		break;}
		
		case SEP :
		{System.out.println("This is the 9th Month of the Year september");
		break;}
		
		case OCT :
		{System.out.println("This is the 10th Month of the Year October");
		break;}
		
		case NOV :
		{System.out.println("This is the 11th Month of the Year November");
		break;}
		
		case DEC :
		{System.out.println("This is the 12th Month of the Year December");
		break;}
		
        default :
        	System.out.println("Invalid Month Name");
	
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		String month=sc.next();
		Demo D=new Demo();
	try {
		
		if(month.equalsIgnoreCase("JAN"))
		D.showDetails(Month.JAN);
		else if(month.equalsIgnoreCase("FEB"))
			D.showDetails(Month.FEB);
		else if(month.equalsIgnoreCase("MAR"))
			D.showDetails(Month.MAR);
		else if(month.equalsIgnoreCase("APR"))
			D.showDetails(Month.APR);
		else if(month.equalsIgnoreCase("MAY"))
			D.showDetails(Month.MAY);
		else if(month.equalsIgnoreCase("JUN"))
			D.showDetails(Month.JUN);
		else if(month.equalsIgnoreCase("JUL"))
			D.showDetails(Month.JUL);
		else if(month.equalsIgnoreCase("AUG"))
			D.showDetails(Month.AUG);
		else if(month.equalsIgnoreCase("SEP"))
			D.showDetails(Month.SEP);
		else if(month.equalsIgnoreCase("OCT"))
			D.showDetails(Month.OCT);
		else if(month.equalsIgnoreCase("NOV"))
			D.showDetails(Month.NOV);
		else if(month.equalsIgnoreCase("DEC"))
			D.showDetails(Month.DEC);
		else
			System.out.println("Invalid Month Name");
	}
	catch(Exception e) {
		System.out.println("Invalid Month Name");
	}
	
		

	}

}
