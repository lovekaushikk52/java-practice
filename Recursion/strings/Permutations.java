
package Recursion.strings;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        // permutation("abc", "");
        System.out.println(permutationList("abc", ""));
        System.out.println(permutationCount("abc", ""));
    }

    static void permutation(String org, String ans) {

        // All characters have been used
        if (org.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // Take the first character
        char ch = org.charAt(0);

        // Try every insertion position in ans
        for (int i = 0; i <= ans.length(); i++) {

            // Part before insertion
            String f = ans.substring(0, i);

            // Part after insertion
            String s = ans.substring(i);

            // Insert ch and process remaining characters
            permutation(org.substring(1), f + ch + s);
        }
    }

    static ArrayList<String> permutationList(String org, String ans) {

        // All characters have been used
        if (org.isEmpty()) {
            ArrayList <String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = org.charAt(0);

        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i);

            // Insert ch and process remaining characters
            list.addAll(permutationList(org.substring(1), f + ch + s));
        }
        return list;
    }

    //counting number of iterations
    static int permutationCount(String org, String ans) {

        // All characters have been used
        if (org.isEmpty()) {
            return 1;
        }

        int count=0;
        char ch = org.charAt(0);

        // i<=ans.length coz the number of recursive calls is equal to ans+1; if ans=abc length will be 3 and loop will run 4 times
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i);

            // Insert ch and process remaining characters
            count=count+(permutationCount(org.substring(1), f + ch + s));
        }
        return count;
    }

    
}
