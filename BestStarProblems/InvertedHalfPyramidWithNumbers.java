/*
7.inverted half pyramid with numbers
12345
1234
123
12
1
 */
package BestStarProblems;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        int n=5;
         for (int i=n; i>=1;i--){
             for (int j=1; j<=i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }
}
