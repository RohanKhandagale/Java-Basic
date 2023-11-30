package ConditionalStatement;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:-");
        int a =sc.nextInt();
        System.out.println("=========Result=========");
        if (a%2!=0){
            System.out.println(a + " Is a Odd Number");
        }else {
            System.out.println(a + " Is a Even Number");
        }
    }
}
