import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8);
        multiple(33,44,"ram","lakhan");
    }
    //if we wanna take different type of arguements
    static void multiple(int a,int b,String ...m){
        System.out.println(Arrays.toString(m));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
