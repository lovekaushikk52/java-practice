package Recursion;

public class NTo1 {
    public static void main(String[] args) {
        // nto1(5);
        reverse(5);
    }

    static void nto1(int n){
        if(n==0){
            return ;
        }
        //here first value is printed and then function is called
        System.out.println(n);
        nto1(n-1);
    }

    static void reverse(int n){
        if(n==0){
            return ;
        }
        // here the value will be reversed as the function wwhich will be ended first will print first
        reverse(n-1);
        System.out.println(n); 
    }
    //5-4-3-2-1 //actual flow
    // flow to exit from call staack 1-2-3-4-5 thats why its printed reverse
    
}
