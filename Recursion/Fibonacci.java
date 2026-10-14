package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans=fibo(10);
        System.out.println(ans);
    }
    
    static int fibo(int n){

     // Base Condition
        if(n<=1){
            return n;
        }
        // recursive call
        return fibo(n-1)+fibo(n-2);
    }
}
