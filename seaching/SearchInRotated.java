package seaching;

public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }

    static int findpivot(int[] arr ){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            //case 1 end bda hona chaahiye mid se jo end+1 out of bound error na de
            if(mid <end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case 2
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //else if
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    
}
