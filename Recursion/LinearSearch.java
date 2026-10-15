package Recursion;

public class LinearSearch {

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6,7,8};
        System.out.println(search(arr, 0, 1));
        System.out.println(searchIndex(arr, 0, 10));
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
}
