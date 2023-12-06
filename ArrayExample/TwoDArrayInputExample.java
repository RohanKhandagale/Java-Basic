/*
 *  WAP for a two dimensional array , take input from user and show the data.
 */
package ArrayExamples;

import java.util.Scanner;

public class TwoDArrayInputExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rep;
		do {
			System.out.println("Enter How Many Rows You Want:-");
			int row = sc.nextInt();
			System.out.println("Enter How Many Column You Want:-");
			int colm = sc.nextInt();
			int[][] User = new int[row][colm];
			//		first loop using for input from user

			for(int i=0; i<row; i++) {
				for(int j = 0;j<colm;j++) {
					User[i][j]	= sc.nextInt();
				}
				
			}
//			second loop using to give output 
			System.out.println("The 2D Array is:-"); // for Answer heading
								// we use sys in start
			for(int i=0; i<row; i++) {
				for(int j=0; j<colm; j++) {
					System.out.print(User[i][j]+ " ");
				}
				System.out.println();
			}
			System.out.println("Do You Want To Continue:-");
			sc.nextLine();
			rep = sc.nextLine();
		}while(rep.equalsIgnoreCase("Y"));
		sc.close();
	}

}
