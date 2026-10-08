package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void cycleSort(int [] arr){
        int i=0;

        while(i<arr.length){
            //index starts from 0 and the value starts from 1 so correct index will be value-1;
            int correct=arr[i]-1;

            // if value at a index is not correct then place it to its correct index
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
