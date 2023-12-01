/*
 * Question:- WAP , print values for leap year, take input from 
 * user start from year and endTill year;
 */
package Assignments;

import java.util.Scanner;

public class ForLoopLepYearExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Year");
		int a = sc .nextInt();
		System.out.println("Enter last Year");
		int b = sc .nextInt();
		int ans = 0;
		System.out.println("Leap Year"+ a + "and" +b);

		for(int i = a; i<=b; i++) {
			if(i%4==0){
				System.out.println(i);
			}
		}


	}
}
