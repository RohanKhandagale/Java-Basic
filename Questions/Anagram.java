package Questions;

import java.io.LineNumberInputStream;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args){
        String word1= "Race";
        String word2 = "Care";

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.length()==word2.length()){
            char[] a =word1.toCharArray();
            char[] b = word2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean Ans = Arrays.equals(a,b);
            if (Ans){
                System.out.println("Word is Anagram");
            }else {
                System.out.println("Not an Anagrams");
            }
        }else {
            System.out.println("Not an anagramS");
        }

    }
}
