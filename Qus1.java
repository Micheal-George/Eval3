package com.Eval3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qus1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("array size :");
		int N=sc.nextInt();
		
		try {
			int[] A=new int[N];
			System.out.println("Enter element");
			for(int i=0;i<N;i++)
			{
				int s=sc.nextInt();
				A[i]=s;
			}
			System.out.println("Enter the index of the array element you want to access");
			int k=sc.nextInt();
	      System.out.println("The array element at index "+k+"="+A[k]);
		}
		catch(InputMismatchException num) {
			  System.out.println("java.lang.NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException ae ) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		  
		}

}
