package Conditional_Thinking.Nested_Conditions;
import java.util.Scanner;

// 10. Take a month number (1–12) and print the number of days in that month (ignore leap years).

public class Question10 {

    public static void main(String[] args) {

        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        
        Scanner sc = new Scanner(System.in);   
        int monthNumber = sc.nextInt();

        if (monthNumber>=1 && monthNumber<=12) {

            switch ( monthNumber ) {
                case 1,3,5,7,8,10,12:
                    System.out.println("31 days in " + monthName[monthNumber -1] + " Month");
                    break;
                case 4,6,9,11:
                    System.out.println("30 days in " + monthName[monthNumber -1] + " Month");
                    break;
                case 2:
                    System.out.println("28 days in " + monthName[monthNumber -1] + " Month");
                    break;
            
                default:
                    break;
            }
          
        }
        else{
            System.out.println("Invalid Month!! enter valid month number between 1 to 12");
        }

        sc.close();
    
    
    }
    
}
