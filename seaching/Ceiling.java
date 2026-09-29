package seaching;
//wwill return smallest number that is greater than or equal to target
public class Ceiling {

    public static void main(String[] args) {
        int [] nums={-32,0,2,3,56,78,99};
        int target=178;
        System.out.println(ceiling(nums, 179));
    }
    
    // return the index
    //in case of no element found we will return -1
    static int ceiling(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
    // in case target number is the largest number
        
        if(target>arr[end]){
            return -1;
        }

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
        System.out.println(arr[start]);
        return start;
    }
    
}
