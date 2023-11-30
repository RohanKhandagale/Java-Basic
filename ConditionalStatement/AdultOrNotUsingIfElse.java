package ConditionalStatement;

import java.util.Scanner;

public class AdultOrNotUsingIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:-");
        int age = sc.nextInt();
        System.out.println("==========Result=========");
        if (age>=18){
            System.out.println("Person Is Adult");
        }else {
            System.out.println("Person Is Not Adult");
        }
    }
}
