package Conditional_Thinking.Creative_Scenarios;
import java.util.Scanner;


// 10. Take a year and print the corresponding century (e.g., “19th century”, “20th century”)


public class Question10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year");
        int year = sc.nextInt();

        int century = year / 100;


        if (year%100==0) {
            System.out.println("Its " + century + " century");
        }
        else{
            System.out.println((century + 1) + " century" );

        }

        sc.close();
    }
    
}
