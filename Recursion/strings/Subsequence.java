package Recursion.strings;

import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        subseqAscii("ab", "");
        System.out.println(subseqRet("ab", ""));
    }

    static void subsequence(String org,String ans){

        if(org.isEmpty()){
            System.out.println(ans);
            return ;
        }

        char ch=org.charAt(0);

        //take it and skip it method
        subsequence(org.substring(1), ans+ch); // take it
        subsequence(org.substring(1), ans); //skip it
    }

    // returning a arrayList
    static ArrayList <String> subseqRet(String org,String ans){

        if(org.isEmpty()){
            ArrayList <String>list=new ArrayList<>();
            list.add(ans);
            return list ;
        }

        char ch=org.charAt(0);

        //take it and skip it method
        ArrayList <String> left=subseqRet(org.substring(1), ans+ch); // take it
        ArrayList <String> right=subseqRet(org.substring(1), ans); //skip it

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String org,String ans){

        if(org.isEmpty()){
            System.out.println(ans);
            return ;
        }

        char ch=org.charAt(0);

        //take it and skip it method
        subseqAscii(org.substring(1), ans+ch); // take it
        subseqAscii(org.substring(1), ans); //skip it
        
            // Take the ASCII value of the character
        subseqAscii(org.substring(1), ans+(ch+0)); //to get ascii value we add 0 to character
    }

    
}
