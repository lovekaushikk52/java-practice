package seaching;

public class MinElementRotated {
    public static void main(String[] args) {
        int nums []={5,4,6,7,9,1,2};
        System.out.println(findMin(nums));
    }

    static int findMin(int []nums){
        int ans=Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[start]<=nums[mid]){
                //array is sorted and we have to eliminate this part
                //if its sorted then start will be lowest
                ans=Math.min(ans,nums[start]);
                start=mid+1;
            }
            else{
                end=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
}
