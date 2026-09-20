import java.util.*;
public class countOccurences{
    public static void main(String[] args) {
        int n=10000000;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==0){
                count+=1;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}