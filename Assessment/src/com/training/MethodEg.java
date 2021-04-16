package com.training;

public class MethodEg  {
	public static void main(String[] args) {
		IntSequence obj=new IntSequence();
		IntSequence.constant(1);	
}
}
class IntSequence
{
	public static void constant(int i)
	{
		while(true)
		{
			System.out.println(i);
		}
	}
}

