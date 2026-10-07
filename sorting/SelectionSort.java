package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,3,1,2,4,-1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int [ ] arr){
        for(int i=0;i<arr.length;i++){
            //find the max element in remaining array and swap with correct index
            int last=arr.length-i-1; //last index
            int maxIndex=getMaxIndex(arr,0,last); // last will change in every pass we can say the value of last will be decrease by 1 in every pass as the sorted array becomes big 

            swap(arr,maxIndex,last); //we will swap max index with last element as the max array's correct position is in the end
        }
    }

    static int getMaxIndex(int [] arr,int start,int end){
        int max=start; //arr[0];
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i; //contains index of largest element
            }
        }

        return max;
    }

    static void swap(int arr [],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
