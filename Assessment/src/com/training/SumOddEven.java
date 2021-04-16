package com.training;

import java.util.Scanner;

public class SumOddEven {
	public static void main(String[] args) {
		System.out.println("Enter Number of element:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Elements of the array:");
		int a[]=new int[n];
		int sum=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sum +=a[i];
			}
			else
			{
				sum1 +=a[i];
			}			
		}
		System.out.println("Sum of Even digits:"+sum);
		System.out.println("Sum of Odd digits:"+sum1);
	}
}
