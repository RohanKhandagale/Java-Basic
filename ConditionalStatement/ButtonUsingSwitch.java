package ConditionalStatement;

import java.util.Scanner;

public class ButtonUsingSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Button Choice:-");
        int Button = sc.nextInt();
        System.out.println("======Result======");
        switch (Button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Ram-Ram");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
