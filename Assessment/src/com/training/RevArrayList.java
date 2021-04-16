package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RevArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Before Reverse");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("After Reverse");
		Collections.reverse(list);
		//System.out.println(list);
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}
}
