package seaching;

public class OrderAgnosticBSearch {
    public static void main(String[] args) {
        int [] nums={91,81,45,32,23,12,1,-3};
        int target=5;
        int ans=binarysearch(nums,1);
        System.out.println(ans);
    }
    
    static int binarysearch(int [] arr,int target){
        
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        
        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            //checking whether array is ascending or descending

            if(isAsc){
                if(arr[mid]>target){
                    end=mid+1;
                }

                else {
                    start=mid-1;
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
