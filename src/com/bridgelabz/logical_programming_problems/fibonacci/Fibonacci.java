package com.bridgelabz.logical_programming_problems.fibonacci;

import java.util.Scanner;

public class Fibonacci {
		
		public static void main(String args[]) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number to print fiboncacci series ");
			int number = scanner.nextInt();
			scanner.close();
			int previousNum =0;
			int currentNum =1;
			System.out.print(previousNum + " "+currentNum);
			int nextNum;
			int count =2;
			while(count<number)
			{
				count++;
				nextNum=previousNum+currentNum;
				previousNum=currentNum;
				currentNum=nextNum;
				System.out.print(" "+nextNum);
			}
			
	}

}
