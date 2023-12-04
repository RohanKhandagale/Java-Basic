package Questions;

public class StringReverse {
    public static void main(String[] args) {
        StringBuilder data = new StringBuilder("Hello");
        System.out.println(data.reverse());

        StringBuffer data2 = new StringBuffer("Hello");
        System.out.println(data2.reverse());

        String dataString = "Hello how are you";
        char[] charArr = dataString.toCharArray();
        int length = charArr.length - 1;
        while(length != -1){
            System.out.print(charArr[length]);
            length--;
        }
    }

}
