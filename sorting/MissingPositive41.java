package sorting;

public class MissingPositive41 {
    public static void main(String[] args) {
        int nums[]={1,2,0};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correct=nums[i]-1;

            if(nums[i]>0 && nums[i]<=nums.length &&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        //search for the missing element
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        //case 2
        return nums.length+1;
    }

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

//Numbers from 1 to n should be placed at indices 0 to n-1.
// Calculate the correct index using correct = nums[i] - 1.
// Ignore numbers that are <= 0 or > n.
// If the current number differs from the number at its correct index, swap them.
// If the correct position already contains the same number, increment i to avoid an infinite loop caused by duplicates.
// After rearranging, the first index where nums[i] != i + 1 gives the missing positive number.
// If all positions are correct, return n + 1.
