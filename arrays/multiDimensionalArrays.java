package arrays;

import java.util.Scanner;

public class multiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int nums [][]=new int[3][]; //adding rows is mandatory columns can be empty
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=sc.nextInt();
            }
        }

        
    }
}
