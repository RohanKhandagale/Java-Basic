/*
take an array as input from user.Search for a given number x and print the index at which
it occurs
 */
package BasicArrayIntroduction;
import java.util.Scanner;
public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []number = new int[size];

        // input
        for (int i=0;i<size;i++){
            number[i]= sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i=0; i<number.length;i++){
            if (number[i]==x){
                System.out.println(" x is found at index"+i);
            }
        }
    }
}
