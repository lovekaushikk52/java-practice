package seaching;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="kunal";
        char target='u';
        boolean ans=search2(name,target);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(ans);
    }

    static boolean search2(String str,char target){
        if(str.length()==0){ //.length is function in string class
            return false;
        }

        for(char ch:str.toCharArray()){//for each require a collection or array to iterate thats why we have to convert a string into char array
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str,char target){
        if(str.length()==0){ //.length is function in string class
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
