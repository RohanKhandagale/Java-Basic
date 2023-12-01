/*
 * 	Question:- WAP, to skip even number with use of continue 
 * and run a loop till the no user gives.And print the others.
 */
package Assignments;
public class ContinueSkipEvenExample {
	public static void main(String[] args) {
		int a = 0;
		do {
			if (a%2==0) {
				a++;
				continue;
			}
			System.out.print(a + " ");
			a++;
		} while (a <50);
	}
}
