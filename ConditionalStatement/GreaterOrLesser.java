package ConditionalStatement;

import java.util.Scanner;

public class GreaterOrLesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number:-");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number:-");
        int b = sc.nextInt();
        System.out.println("=======Result=======");
        if (a==b){
            System.out.println(" Both Number's are Equal ");
        } else if (a>b) {
            System.out.println(a+" Is greater "+b);
        }else {
            System.out.println(a+" Is lesser Than "+b);
        }
    }
}
