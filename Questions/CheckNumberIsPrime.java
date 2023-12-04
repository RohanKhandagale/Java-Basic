package Questions;/*
factors of prime numbers
 */
import java.util.Scanner;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = null;
        do {
            System.out.println("Enter Your number:-");
            int a = sc.nextInt();
            int count = 0;
            //int a = 6;
            for (int i=1;i<=a;i++){
                if (a%i==0){
                    count++;
//                System.out.print(i+" ");

                }
            }

            if(count == 2){
                System.out.println(a +" is a prime number");
            }
            else {
                System.out.println(a+ " is not a prime number");
            }
            System.out.println("Enter your choice-->");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("y"));
        sc.close();

    }
}
