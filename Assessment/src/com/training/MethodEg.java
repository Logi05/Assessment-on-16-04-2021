package com.training;

System.out.println("Using Lambda Expression:");

interface IntSequence1{
	public int constant(int a);
}
public class Method1 {
	public static void main(String[] args) {
		IntSequence1 ab=a->{
			while(true)
			{
				System.out.println(a);
			}
		};
		System.out.println(ab.constant(1));
	}
}

/*System.out.println("Using Normal Static Method of Class:");

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
}*/

