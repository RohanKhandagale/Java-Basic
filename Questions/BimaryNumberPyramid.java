package Questions;

/*
print.
1
O1
1O1
O1O1
1O1O1
 */
public class BimaryNumberPyramid {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                int sum = i+j;
                if (sum % 2==0){
                    System.out.print("1");
                }else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
