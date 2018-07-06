package com.exilant;

import java.util.Scanner;

public class Assignment1Task1 {

	public static void main(String[] args) {
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data:");
		String str=sc.nextLine();
		int arr[ ]=new int[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			arr[i]=Integer.parseInt(str.substring(i, i+1));
		}
		
		int size=arr.length;
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			index=i+1;
			
			if(i==size-1)
			{
				if(arr[i]==arr[0])
				{
					sum=sum+arr[i];
				}
			}
			
			else if (arr[i]==arr[index]) {
				
				sum=sum+arr[index];
				
			}
		}
		System.out.println(sum);
	}

}
