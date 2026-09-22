import java.util.*;
public class Function {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);
    }

    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int sum=a+b;
        return sum;
    }

    static void sum(){ //void will not return anything
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of two numbers is :" + sum);
    }
}
