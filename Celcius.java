import java.util.*;

public class Celcius{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temp in celcius:");
        float tempc=sc.nextFloat();
        float tempf=(tempc*9/5)+32;
        System.out.println(tempf);
    }
}
