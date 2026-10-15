package Recursion;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int [] arr={3,4,5,12,18};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int [] arr,int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
    
}

/*

Approach:
Check each element with the next element recursively. If any element is greater than or equal to the next one, the array is not strictly increasing.

Steps to remember
Base case: If index == arr.length - 1, return true because all elements have been checked.

Compare adjacent elements: Check if arr[index] < arr[index + 1].

Recursive call: If the condition is true, recursively check the remaining array using index + 1.

Return false immediately: If the current element is not smaller than the next element, && short-circuits and returns false.

 */