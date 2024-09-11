// Java program that converts a given string to Upper case:

package com.programs;

import java.util.Scanner;

public class ConvertToUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		convertToUppercase(s);
	}
	
	public static void convertToUppercase(String s)
	{
		char []charArray = s.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i] >= 'a'  &&  charArray[i] <= 'z')
			{
				charArray[i] = (char)(charArray[i] - 32);
			}
		}
		String result = new String(charArray);
		System.out.println("Output : " + result);
		
	}
}
