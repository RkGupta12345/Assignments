package com.exilant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int size1=3;
		int arr[][]=new int[size1][];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<size1;i++)
		{
			System.out.println("Enter size of row:");
			int size=sc.nextInt();
			arr[i]=new int[size];
			System.out.println("Enter the element for row:");
			
			for(int j=0;j<size;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
			
			for(int i=0;i<size1;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println(arr[i][j]);
				}
				
				System.out.println();
			}
			
			ArrayList al=new ArrayList<>();
			
			for(int a[]:arr)
			
			{
				al.add(a);
			}
			
			int sum=0;
			for(int i=0;i<size1;i++)
			{
				Object obj=al.get(i);
				int a[]=(int[])obj;
				Arrays.sort(a);
				int min=a[0];
				int max=a[a.length-1];
				
				System.out.println("Max Element::"+max);
				System.out.println("Min Element::"+min);
				
				int diff=max-min;
				System.out.println("Difference is::"+diff);
				
				sum=sum+diff;
				
				
			}
			
			System.out.println("Total Sum Is:::"+sum);
					
		}
	}


