package seaching;

public class FindNumbers {
    public static void main(String[] args) {
        int [] nums={12,345,2,6,7896};
        System.out.println(countEven(nums));
        System.out.println(digits(342));
    }
    static int countEven(int [] nums ){
        int count=0;
        for(int num:nums){
            if (even(num)){
                count++;
            }
        }


        return count;
    }
// function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits=digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }

        int count=0;
        
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
//easy method to count digits
    static int digits2(int num){
        if (num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
