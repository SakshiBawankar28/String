//Input: EmTec   Output: eMtEC

package com.programs;

import java.util.Scanner;

public class UpperLowercase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
    
        upperLowercase(s);
    }
    
    public static void upperLowercase(String s)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) 
            {
                result.append(Character.toLowerCase(c));
            } 
            else 
            {
                result.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println("Output : " + result.toString());
    }
}
