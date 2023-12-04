package Questions;

import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your ");
        String Abc = sc.nextLine();
        String Alpha ="Abcdefghijklmnopqrstuvwxyz";
        Alpha = Alpha.toLowerCase();

        boolean Alpha1 = true;

        System.out.println("");
        for (char c='a'; c<='z';c++){
//            System.out.println(c);
            if(!Abc.contains(String.valueOf(c))){
                Alpha1 = false;
            }
        }

        if (Alpha1){
            System.out.println("Pangram");
        }else {
            System.out.println("not");
        }


    }
}
