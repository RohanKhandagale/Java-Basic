package Questions;

/*
54321
4321
321
21
1
 */
public class ReversPyramidNumeric {
    public static void main(String[] args) {
        for (int i = 0; i<=5;i++){
            for (int j=5-i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
