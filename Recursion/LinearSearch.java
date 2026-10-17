package Recursion;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,4,5,6,7,8};
        System.out.println(search(arr, 0, 1));
        System.out.println(searchIndex(arr, 0, 10));
        ArrayList <Integer> list=new ArrayList<>();
        System.out.println(FindAllIndex(arr, 9, 0, list));
    }
    
    static boolean search(int [] arr,int index,int target){

        if(index==arr.length-1){
            return false;
        }

        return arr[index]==target || search(arr, index+1, target);
    }

    //finding index
    static int searchIndex(int [] arr,int index,int target){

        if(index==arr.length-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        else{
            return searchIndex(arr, index+1, target);
        }

    }

    //returning all indexes into arraylist

    static ArrayList<Integer> FindAllIndex(int [] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }

        return FindAllIndex(arr, target, index+1, list);
            
    }

    //bad approach
    static ArrayList<Integer> FindAllIndex2(int [] arr,int target,int index){
        ArrayList <Integer> list=new ArrayList<>();

        if(index==arr.length-1){
            return list;
        }

        //every time this will contain answer of a particular function call
        if(arr[index]==target){
            list.add(index);
        }

         ArrayList<Integer> ansFromBelowCalls =FindAllIndex2(arr, target, index+1);

         list.addAll(ansFromBelowCalls);
         return list;
            
    }
}
