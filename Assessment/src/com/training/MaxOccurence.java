package com.training;

import java.util.Scanner;

public class MaxOccurence {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int s[]=new int[256];
		for(int i=0;i<str.length();i++)
			s[str.charAt(i)]++;
		int max=-1;
		char result=' ';
		for(int i=0;i<str.length();i++)
		{
			if(max<s[str.charAt(i)])
			{
				max=s[str.charAt(i)];
				result=str.charAt(i);
			}
		}			
				System.out.println(result);
	}		
}

