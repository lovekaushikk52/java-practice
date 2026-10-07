package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int nums []={5,3,1,2,8,6};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int [] arr){
        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j>0;j--){ //loop ulti chlegi kyuki j aur j-1 compare honge
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int arr [],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
