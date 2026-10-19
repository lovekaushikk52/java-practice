package Recursion.strings;

import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {
        System.out.println(diceRet("", 3));
    }
    
    static void dice(String ans,int target){
        if(target==0){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=6 &&i<=target;i++){
            dice(ans+i, target-i);
        }
    }

    static ArrayList<String> diceRet(String ans,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=6 &&i<=target;i++){
            list.addAll(diceRet(ans+i, target-i));
        }
        return list;
    }
}
