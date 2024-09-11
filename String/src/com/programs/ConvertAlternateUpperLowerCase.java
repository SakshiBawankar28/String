package com.programs;

import java.util.Scanner;

public class ConvertAlternateUpperLowerCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		convertAlternateUpperLowerCase(s);
	}
	
	
	public static void convertAlternateUpperLowerCase(String s)
	{
		char []charArray = s.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			if(i % 2 == 0)
			{
				if(charArray[i] >= 'a' && charArray[i] <= 'z')
				{
					charArray[i] = (char)(charArray[i] - 32);
				}
			}
			else
			{
				if(charArray[i] >= 'A' && charArray[i] <= 'A')
				{
					charArray[i] = (char)(charArray[i] + 32);
				}
			}
		}
		
		String result = new String(charArray);
		System.out.println("Output : " + result);
	}
}
