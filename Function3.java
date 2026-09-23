import java.util.*;
public class Function3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; //in case of not primitive data types value of reference variable is passed so original value is changed
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int nums[]){
        nums[0]=99;
    } 
}
