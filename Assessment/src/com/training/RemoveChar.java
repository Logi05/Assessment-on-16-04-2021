package com.training;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0,j=0;
		char c1;
		char a1[]=new char[10];
		System.out.println("Enter a Character:");
		char c=sc.next().charAt(0);
		char a[]=s.toCharArray();
		
		for(i=0;i<s.length();i++)
		{
			if(a[i]!=c)
			{
				c1=a[i];
				a1[j]=c1;
				j++;
			}
		}
		a1[j]='\0';
		System.out.println(a1);
	}	
}
