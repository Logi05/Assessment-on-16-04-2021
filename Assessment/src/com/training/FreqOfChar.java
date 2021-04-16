package com.training;

import java.util.Scanner;

public class FreqOfChar {
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a[]=new int[s.length()];
		char str1[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			a[i]=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(str1[i]==str1[j])
				{
					a[i]++;
					str1[j]='0';
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(str1[i]!=' ' && str1[i]!='0')
			{
			System.out.println(str1[i]+" "+a[i]);
			}
		}
	}
}
