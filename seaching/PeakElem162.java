package seaching;

public class PeakElem162 {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        System.out.println(FindingPeak(nums));
    }

    static int FindingPeak(int [] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
            return start; 
            //start and mid both will be finding largest element so we caneither return start or end
            
        }
    
}
