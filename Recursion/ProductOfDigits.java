package Recursion;

public class ProductOfDigits {

    public static void main(String[] args) {
        int ans=productSum(1832);
        System.out.println(ans);
    }

    static int productSum(int n){
        if(n%10==n){ // last digit is remaining return n
            return n;
        }
        return (n%10)* productSum(n/10);
    }
    
}
