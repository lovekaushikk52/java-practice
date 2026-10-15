package seaching;

public class SquareRoot {
    public static void main(String[] args) {
        int n=31;
        System.out.println(sqrt(n));
    }
    
    static int sqrt(int n){
        int start=1;
        int ans=1;
        int end=n;

        while(start<end){
            int mid=start+(end-start)/2;

            if(mid*mid <=n){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
