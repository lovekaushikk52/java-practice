import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (isArmstrong(n)){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong");
        }
    }

    static boolean isArmstrong(int n){
        int origional=n;
        int sum=0;

        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;

        }
        if(sum== origional){
            return true;
        }
        return false;
    }
}
