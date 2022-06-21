package com.monocept;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i,n,factorial=1;
		n=sc.nextInt();
		i=n;
		while(n!=0)
		{
			factorial*=n;
			n--;
		}
		System.out.println("Factorial of "+n+" is "+factorial);

	}

}
