package Conditional_Thinking.Simple_Conditions;
import java.time.Year;
import java.util.Scanner;


// 5. Check if a given year is a leap


// This problem have two approachs:

// 1. is by using conditions
// 2. is by using time-year library



public class Question5 {

    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     int year = sc.nextInt();

    //     if (year%4==0 || year%400==0 && year%100!=0 ) {
    //         System.out.println(year + " is leap year");
    //     }
    //     else{
    //         System.out.println(year + " is not leap year");
    //     }

    //     sc.close();
    // }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (Year.isLeap(year)) {
             System.out.println(year + " is leap year");
        }
        else{
            System.out.println(year + " is not leap year");
        }
        sc.close();
        
    }
    
}
