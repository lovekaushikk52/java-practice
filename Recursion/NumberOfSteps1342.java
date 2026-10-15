package Recursion;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfSteps1342 {
    public static void main(String[] args) {
        System.out.println(steps(123));
    }

    static int steps(int n){
        return helper(n,0);
    }
// helper function is a kind of function which pass the arguement to other function
    static int helper(int n,int c){

        if(n==0){
            return c;
        }

        if(n%2==0){
            return helper(n/2, c+1);
        }
        return helper(n-1,c+1); 
    }
    
}
