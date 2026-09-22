import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String fruit=sc.next();

        //this looks repetitive so we use switch

        // if(fruit.equals("mango")){ // == checks whether two varibles are sharing same object
        //     System.out.println("king of fruits"); //.equals checks value only
        // }
        // if(fruit.equals("apple")){ 
        //     System.out.println("red fruit"); 
        // }

        /*  switch (fruit) {
            case "mango":
                System.out.println("king of fruits");                
                break;
            
            case "apple":
                System.out.println("red fruit");                
                break;
            
            case "banana":
                System.out.println("yellow fruits");                
                break;
            
            case "grapes":
                System.out.println("small fruits");                
                break;

            case "orange":
                System.out.println("round fruits");                
                break;

            default:
                System.out.println("enter different fruit");
                break;
        }*/

            int day=sc.nextInt();
            switch(day){
                case 1 ->System.out.println("monday");
                case 2 ->System.out.println("tuesday");
                case 3 ->System.out.println("wednesday");
                case 4 ->System.out.println("thrusday");
                case 5 ->System.out.println("friday");
                case 6 ->System.out.println("saturday");
                case 7 ->System.out.println("sunday");
                default -> System.out.println("Enter a number between 1 and 7");

            }
        }
}
