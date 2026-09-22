import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter employee ID:");
       int EmpId=sc.nextInt();
       System.out.println("enter department");
       String department=sc.next();
       
       switch(EmpId){
        case 1:
            System.out.println("love kaushik");
            break;

        case 2:
            System.out.println("mahendra negi");
            break;

        case 3:
            // System.out.println("enter department IT Or Management");
            switch(department){
                case "IT":
                    System.out.println("IT department");
                    break;

                case "Management":
                    System.out.println("management department");
                    break;

                default:
                    System.out.println("no department exists");
                    break;
            }
            break;
        default:
            System.out.println("enter correct employee Id");
       }

    }
}
