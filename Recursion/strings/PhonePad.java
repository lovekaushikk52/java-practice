package Recursion.strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(padRet("", "12"));
    }

    static void pad(String ans,String org){
        if(org.isEmpty()){
            System.out.println(ans);
            return ;
        }

       int digit= org.charAt(0)-'0';
       //'this will conver '2' into 2

       for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i); //it will increase character ascii value and change it into charcter again

            pad(ans+ch, org.substring(1));

       }

    }

    static ArrayList<String> padRet(String ans,String org){
        if(org.isEmpty()){
            ArrayList <String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList <String> list=new ArrayList<>();

       int digit= org.charAt(0)-'0';
       //'this will conver '2' into 2

       for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i); //it will increase character ascii value and change it into charcter again

            list.addAll(padRet(ans+ch, org.substring(1)));

       }
       return list;
    }
    
}
