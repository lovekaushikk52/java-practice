package seaching;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[] [] nums={
            {23,4,2},
            {18,12,3,9},
            {78,99,63,42,33}
        };
        int target=33;
        int [] ans=search(nums,target);
        System.out.println(Arrays.toString(ans));

        int maxi=max(nums);
        System.out.println("the maximum element of this array is:"+maxi);
    }
    static int [] search(int [][] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    static int max(int [][] nums){
        // int max=Integer.MIN_VALUE; //any value that is leseer than all values in array
        int max=nums[0][0];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]>max){
                    max=nums[i][j];
                }
            }
        }
        return max;
    }
}
