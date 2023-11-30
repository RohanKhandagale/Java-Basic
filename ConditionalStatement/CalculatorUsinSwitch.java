package ConditionalStatement;


import java.util.Scanner;

public class CalculatorUsinSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose operation(+,-,,*,/,%)");
        String op = sc.nextLine();
        System.out.println("Enter Numbers:-");
        int a =sc.nextInt();
        int b= sc.nextInt();
        int Ans = 0;

        switch (op) {
            case "+":
                Ans = a + b;
                System.out.println("Your Addition is:-" + Ans);
                break;
            case "-":
                Ans = a - b;
                System.out.println("Your Subtraction is:-" + Ans);
                break;
            case "*":
                Ans = a * b;
                System.out.println("Your Multiplication  is:-" + Ans);
                break;
            case "/":
                Ans = a / b;
                System.out.println("Your Division is:-" + Ans);
                break;
            case "%":
                Ans = a % b;
                System.out.println("Your Remainder is:-" + Ans);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
