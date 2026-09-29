package seaching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums={-32,0,2,3,56,78,99};
        int target=178;
        System.out.println(binarySearch(nums, target));
    }
    
    // return the index
    //in case of no element found we will return -1
    static int binarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
