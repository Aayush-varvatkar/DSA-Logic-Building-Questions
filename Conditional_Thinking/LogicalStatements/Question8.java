package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 8. Take a weekday number (1–7) and determine if it is a weekday or weekend


public class Question8 {

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Week as a number from 1 to 7");
        int daynum = sc.nextInt();

        if (daynum>0 && daynum<=7) {
            if (daynum==7) {
                System.out.println(days[daynum-1] + "is weekend");
            }
            else{
                System.out.println(days[daynum - 1] + " is weekday");
            }
        }
        else{
            System.out.println("invalid date");
        }

        sc.close();
    }
    
}
