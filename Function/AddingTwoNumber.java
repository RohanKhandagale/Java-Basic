/*
make a function to add two numbers nd return sum
 */
package FuctionsAndMethod;

import java.util.Scanner;

public class AddingTwoNumber {
    public static int calculate(int a,int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculate(a,b);
        System.out.println(sum);

    }
}
