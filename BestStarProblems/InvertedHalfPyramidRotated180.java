/*
5.Inverted half pyramid
    *
   **
  ***
 ****

 */
package BestStarProblems;

public class InvertedHalfPyramidRotated180 {
    public static void main(String[] args) {
        int n= 4;
         // outer loop for Rows
        for (int i=1; i<=n;i++){
            //inner loop for Space
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
