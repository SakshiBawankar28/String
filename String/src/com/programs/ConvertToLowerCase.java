// Java program that converts a given string to lowercase:

package com.programs;

import java.util.Scanner;

public class ConvertToLowerCase 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.next();
		convertToLowercase(s);
		
	}
	
	
	public static void convertToLowercase(String s)
	{
		char []charArray  = s.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i] >= 'A'  &&  charArray[i] <= 'Z')
			{
				charArray[i] = (char)(charArray[i] + 32);
			}
		}
		// Convert the character array back to a string and print the result
        String result = new String(charArray);
        System.out.println("Output: " + result);
	}

}

