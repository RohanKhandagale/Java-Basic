package FuctionsAndMethod;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);  // here we call function

    }
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
}
