package Recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int [] arr={3,4,8,9,72,-1,1,2};
        System.out.println(search(arr, 0, arr.length-1, -1));
    }

    static int search(int arr[],int start,int end,int target){

        if(start>end){
            return -1; //nhi mmila
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        
        if(arr[start]<=arr[mid]){
            if(arr[start]<=target && target<=arr[mid]){
                return search(arr, start, mid-1, target);
            }
            else{
                return search(arr, mid+1, end, target);
            }
        }

        if(target>=arr[mid] && target <=arr[end]){
            return search(arr, mid+1, end, target);
        }
        else{
            return search(arr, start, mid-1, target);
        }
    
    }
    
}
