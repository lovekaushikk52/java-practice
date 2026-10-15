package Recursion;

public class RecursiveBinarysearch {

    public static void main(String[] args) {
        int arr []={1,3,7,28,61};
        int ans=binary(arr, 20, 0, arr.length);
        System.out.println(ans);
    }

    static int binary(int[] arr,int target,int start,int end){

        if(start>end){
            //element nhi mila
            return -1;
        }

        int mid=start+(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
        // agr target bda h toh right side search kro
        if (target>arr[mid]){
            return binary(arr, target, mid+1, end);
        }
        // vrna left side
        return binary(arr, target, start, mid-1);
    }
    
}
