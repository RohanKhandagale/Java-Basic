package Questions;

/*
2.number reversal
 */
public class NumberReversal {
    public static void main(String[] args){

        int number = 125 ;
        int reverse = 0;
        int remainder = 0;

        while(number != 0){
            remainder = number % 10 ;

            reverse = (reverse * 10) + remainder ;

            number = number / 10 ;
        }
        System.out.println("Reverse = "+ reverse);
    }
}
