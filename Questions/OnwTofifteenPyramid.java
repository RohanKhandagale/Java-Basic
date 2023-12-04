package Questions;

/*
print
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class OnwTofifteenPyramid {
    public static void main(String[] args) {
        int a=1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

        /*
        1
        12
        123
        1234
        12345
        and reverse
        12345
        1234
         */

     //   for (int i=5;i>=1;i--){
            //for(int i=1;i<=5;i++){  -----> from 1 to 12345
        //    for (int j=1;j<=i;j++){
              //  System.out.print(j);
       //     }
        //    System.out.println();
       // }
    }
}
