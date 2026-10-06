package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={5,3,1,2,4,-1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr){
        boolean isSwapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                System.out.println("loop is not running so array is sorted");
                break;
            }
        }
    }
}