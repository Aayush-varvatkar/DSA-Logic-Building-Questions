package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.

public class Question4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hour- 0 to 23");
        int hour = sc.nextInt();

        System.out.println("Enter minute - 0 to 59");
        int minute = sc.nextInt();

        if(hour<0 || hour > 23  || minute <0 || minute > 59){
            System.out.println("Invalid time");
        }
        else if(hour>12){
            System.out.println("PM");
        }
        else{
            System.out.println("AM");
        }

        sc.close();

        
    }
}
