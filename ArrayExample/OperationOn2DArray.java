package ArrayExamples;

import java.util.Scanner;

public class OperationOn2DArray {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

		//		System.out.println("How many rows do you want:-");
//		int[][]a = {{1,3,4},{2,4,3},{3,4,5}};
//		int[][]b = {{1,3,4},{2,4,3},{1,2,4}}; 
		//		 System.out.println("How many column do you want:-");


				int[][] a = new int[2][2];
				int[][] b = new int[2][2];
		int[][] c = new int[2][2];
		
		System.out.println("Input: a");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				 a[i][j] = sc.nextInt();

			}
		}
		System.out.println("Input: b");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		  
		System.out.println("The Addition is:-");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2;j++) {

				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The Subtraction is:-");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2;j++) {
				c[i][j]= a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The Multipication is:-");
		for(int i=0; i<2; i++) {
			 for(int j=0; j<2;j++) {
				 for(int k=0; k<2; k++) {
					 c[i][j]+= a[i][j]*b[i][j];

				 }
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
