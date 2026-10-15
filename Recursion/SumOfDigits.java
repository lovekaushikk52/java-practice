package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitsum(1832));
    }

    static int digitsum(int n){

        if(n==0){
            return 0;
        }
        return digitsum(n/10)+n%10;
    }
    
}
