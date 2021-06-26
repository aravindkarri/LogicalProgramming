package com.bridgelabz.logical_programming_problems.reversenumber;

import java.util.Scanner;

public class ReverseNumber {
		
		public static void main(String args[]) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number to reverse ");
			int number = scanner.nextInt();
			scanner.close();
			int remainder=0,reverse=0;
			while (number!=0)
			{
				remainder=number%10;
				reverse=(reverse*10)+remainder;
				number=number/10;
			}
			System.out.println("reverse of given number is "+reverse);
		}

}
