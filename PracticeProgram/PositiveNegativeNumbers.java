package Assignments;

import java.util.Scanner;

public class PositiveNegativeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String put;
		do {
			System.out.println("Enter");
			int a = sc.nextInt();
			if(a>1) {
				System.out.println("Number is positive");
			}if(a<0){
				System.out.println("Number is Negative");

			}else if(a==0){
				System.out.println("Number is zero");
			}
			System.out.println("Do you want to continue:-");
			sc.nextLine();
			put=sc.nextLine();
		}while(put.equals("y"));
		sc.close();
	}
}