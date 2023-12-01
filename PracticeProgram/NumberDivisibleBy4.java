/*
 * 	Question:- WAP, use break when the numbers are divisible by 4.
 *  Take input till what no the user wants to run the loop.Print the other values

 */
package Assignments;

import java.util.Scanner;

public class NumberDivisibleBy4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int UserInput = sc.nextInt();
		for (int i=1;i<=UserInput; i++) {
			if(i%4==0) {
				System.out.println("Last Divisible is:-"+ i);
				break;
			}
			System.out.println(i);
			
		}
		sc.close();
	}
	

}
