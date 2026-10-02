package seaching;
// https://leetcode.com/problems/find-in-mountain-array/
public class SeachInMOuntain {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        System.out.println(search(nums,4));
    }

    static int search(int [] arr,int target){
        int peak=FindingPeak(arr);
        //first half
        int firstTry=binarysearch(arr, target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        //second half
        return binarysearch(arr, target, peak+1, arr.length-1);
    }
     static int FindingPeak(int [] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
            return start; 
            //start and mid both will be finding largest element so we caneither return start or end
            
        }

        static int binarysearch(int [] arr,int target,int start,int end){

        boolean isAsc=arr[start]<arr[end];

        
        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            //checking whether array is ascending or descending

            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }

                else {
                    start=mid+1;
                }
            }

            else{
                if(arr[mid]>target){
                    start=mid+1;
                }

                else {
                    end=mid-1;
                }
            }
            
        }

        return -1;

    }
}
