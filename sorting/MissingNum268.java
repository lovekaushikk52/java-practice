package sorting;
import java.util.*;

public class MissingNum268 {
    public static void main(String[] args) {
        int arr[]={4,0,1,2};

        System.out.println(missing(arr));
    }

    static int missing(int [] arr){
        int i=0;

        while(i<arr.length){
             int correctIndex=arr[i];

            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){ // ignoring the last element by using first condition
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        //search for the missing element
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        // case 2
        // agr N hi missing element h toh last mai n hi print kra de
        return arr.length;
    }

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
