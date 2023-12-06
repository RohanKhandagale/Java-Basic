/*
 * WAP for a normal integer 
 * array and take input from user, also show the data after input
 */
package ArrayExamples;

import java.util.Scanner;

public class SmipleArrayOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Arrays Size");
		int size = sc.nextInt();
		int[] simple = new int[size];

		for(int i =0; i<size; i++) {
			simple[i] = sc.nextInt();

		}
		for(int i=0; i<size; i++) {
			System.out.println(simple[i]);
		}
		sc.close();
	}	
}