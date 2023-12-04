package Questions;/*
1.word reversal
 */
import java.util.Arrays;

public class WordrRevrsal {
    public static void main(String[] args){
        String data = " Dog bites Man";
        data = data.strip();
        System.out.println(Arrays.asList(data.split("\\s")));
        String[] dataArr = data.split("\\s");

        for(int i = dataArr.length - 1; i>=0; i--){
            System.out.print(dataArr[i] +" ");
        }

        StringBuilder data2 = new StringBuilder("123");
        System.out.println(data2.reverse());
    }
}
