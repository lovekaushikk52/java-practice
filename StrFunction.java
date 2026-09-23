import java.util.*;
public class StrFunction {
    public static void main(String[] args) {
        String ans=greet();
        System.out.println(ans);
    }

    static String greet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the greetings....");
        String greeting=sc.nextLine();
        return greeting;
    }
}
