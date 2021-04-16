package com.training;

import java.util.Scanner;

public class MaxOccurence {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int f[]=new int[str.length()];
		char max=str.charAt(0);
		int i,j,max1;
		char string[]=str.toCharArray();
		for(i=0;i<string.length;i++)
		{
			f[i]=1;
			for(j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0')
				{
					f[i]++;
					string[j]='0';
				}
			}
		}
		max1=f[0];
		for(i=0;i<f.length;i++)
		{
			if(max1<f[i])
			{
				max1=f[i];
				max=string[i];
			}
		}
		System.out.println("Minimum Occurence of Character :"+max);		
	}		
}

