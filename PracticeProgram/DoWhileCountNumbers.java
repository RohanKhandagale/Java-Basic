/*
 * 	Question:- WAP, use break when the numbers are divisible by 4.
 *  Take input till what no the user wants to run the loop.Print the other values

 */
package Assignments;

import java.util.Scanner;

public class DoWhileCountNumbers {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String put;
		do {
			System.out.println("Enter number");
			int a = sc.nextInt();
			if(a%4==0) {
				System.out.println("Number is divisible");
				break;
			}else {
				System.out.println("Not divisible by 4");
			}
			System.out.println("Do you want to continue");
			sc.nextLine();
			put=sc.nextLine();
		}while(put.equals("y"));
		sc.close();
	}
}

