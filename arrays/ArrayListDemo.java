package arrays;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);

        list.add(32);
        list.add(52);
        list.add(95);
        list.add(877);
        list.add(944);
        list.add(1232);
        list.add(3122);
        System.out.println(list.contains(765432));
        list.set(0,99);//we are adding 99 to 0 index
        System.out.println(list);
    }
}
