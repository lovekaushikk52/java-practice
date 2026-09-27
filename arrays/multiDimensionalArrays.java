package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int nums [][]=new int[3][3]; //adding rows is mandatory columns can be empty
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=sc.nextInt();
            }
        }

        // for (int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //enhanced for loop

        // for(int a []:nums){ //the data type is arr and its named as num so datatype is num here
        //     System.out.println(Arrays.toString(a));
        // }

        for (int i=0;i<nums.length;i++){
            System.out.println(Arrays.toString(nums[i]));
        }

    }
}
