package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int arr[]=new int[5];
        String arr2[]=new String[5];
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<arr2.length;i++){
             arr2[i]=sc.next();
        }
        System.out.println("after printing");
        // for (int i=0;i<5;i++){
        //     System.out.println(arr2[i]);
        //     // System.out.println(arr[i]); //by default value will be 0
        // }

        for (String str : arr2) { //for each loop
            System.out.print(str+" ");
        }

        // System.out.println(Arrays.toString(arr2));
    }
}
