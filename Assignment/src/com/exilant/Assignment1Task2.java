package com.exilant;

import java.util.Scanner;

public class Assignment1Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element:");
		String str=sc.next();
		int sum=0;
		
		String firsthalf=str.substring(0, str.length()/2);
		String secondhalf=str.substring(str.length()/2,str.length());
		
		for(int i=0;i<str.length()/2;i++)
		{
			if(firsthalf.charAt(i)==secondhalf.charAt(i))
			{
				int a=Integer.parseInt(str.substring(i, i+1));
				sum=sum+a*2;
			}
		}
		System.out.println("Sum:"+sum);
		
	}

}
