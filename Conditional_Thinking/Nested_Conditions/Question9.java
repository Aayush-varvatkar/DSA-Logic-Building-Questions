package Conditional_Thinking.Nested_Conditions;
import java.util.Scanner;


// 9. Take a day number (1–7) and print the corresponding day name.


public class Question9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        if (day>=1 && day<=7) {
            switch (day) {
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("THrusday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            
                default:
                    break;
            }
        }
        else{
            System.out.println("Invalid day input");
        }


        sc.close();
    }
    
}
