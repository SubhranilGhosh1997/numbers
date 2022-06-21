package com.monocept;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n,flag=0;
		n=sc.nextInt();
		for (int i=2;i<n;i++)
		{
			if (n%i==0)
			{
				flag=1;
				System.out.println(n+" is not a Prime Number");
				break;
			}
		}
		if (flag==0)
			System.out.println(n+" is a Prime Number");
		
	}

}
