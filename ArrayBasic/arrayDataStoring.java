/*
fill Three Subjects Marks
 */
package BasicArrayIntroduction;

public class arrayDataStoring {
    public static void main(String[] args){
        int[]marks = new int[4];
        marks[0]= 98; //chem
        marks[1] = 89;//bio
        marks[2] = 94;//math
        marks[3] = 78;//phy
        System.out.println(marks[0]); //
        System.out.println(marks[1]);//for print all values we simply use loop
        System.out.println(marks[2]);//
        System.out.println(marks[3]);//

        for (int i=0; i<4; i++){
            System.out.println(i);
        }
    }
}
