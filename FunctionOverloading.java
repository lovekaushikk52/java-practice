import java.util.*;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun("krishna");
        // fun(9);
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
