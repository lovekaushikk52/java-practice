package seaching;
// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;

        System.out.println(ans(arr, target));
    }

    static int ans(int [] arr,int target){
        
        //first find the range
        //start with the size of box=2;
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(arr[end]<target){
            //we have to double
            int newStart=end+1; //we are not keep here start coz we are using tht value in end
            //new end will be prev box end+size*2;
            end=end+(end-start+1)*2;
            //e-(s-1)=e-(s+1) //s-1 was size of previous box which we have to remove to get new box
            start=newStart;
        }

        //return binary search
        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int [] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
