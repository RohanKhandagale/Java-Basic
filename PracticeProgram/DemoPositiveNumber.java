package Assignments;

import java.util.Scanner;

public class DemoPositiveNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		String choice = "";
		do {
			System.out.println("Enter number:");
			int number = sc.nextInt();
			
			if(number<0) {
				negativeCount++;
			}
			else if(number>0)
			{
				positiveCount++;
			}
			else {
				zeroCount++;
			}
			System.out.println("Do You Want To Continue?");
			sc.nextLine();
			
			choice = sc.nextLine();
		}while(choice.equalsIgnoreCase("Y"));
		
		System.out.println("Count of Negative Numbers:"+negativeCount);
		System.out.println("Count of Positive Numbers:"+positiveCount);
		System.out.println("Count of Zero Numbers:"+zeroCount);
		sc.close();
	}
}