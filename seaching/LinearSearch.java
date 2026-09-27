package seaching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,456,65};
        int target=456;
        int ans=search2(arr,target);
        System.out.println(ans);
    }

// returning the element
    static int search2(int arr[],int target){
        if (arr.length==0){
            return -1;
        }

        //run a for loop
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }

    
    // return the index if item is found and in case its not found we will return -1
    static int search(int arr[],int target){
        if (arr.length==0){
            return -1;
        }

        //run a for loop
        for (int index=0;index<arr.length;index++){
            if (arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
