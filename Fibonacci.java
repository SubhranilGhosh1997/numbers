package com.monocept;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n;
		n=sc.nextInt();
		int num_1=0,num_2=1,num_3;   
		 System.out.print(num_1+" "+num_2);  
		    
		 for(int i=2;i<n;i++)
		 {    
		  num_3=num_1+num_2;    
		  System.out.print(" "+num_3);    
		  num_1=num_2;    
		  num_2=num_3;  
		 }

	}

}
