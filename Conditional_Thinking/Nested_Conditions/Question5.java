package Conditional_Thinking.Nested_Conditions;

import java.util.Scanner;

// 5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good
//    Evening”, or “Good Night"

public class Question5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double hour = sc.nextDouble();

        if( hour>=0  && hour<=23){
            if (hour>=5 && hour<12) {
                System.out.println("morning");
            }
            else if(hour>=12 && hour<17){
                System.out.println("Afternoon");
            }
            else if(hour>=17 && hour<20){
                System.out.println("Evening");
            }
            else{
                System.out.println("Night");
            }
        }
        else{
            System.out.println("invalid input");
        }

        sc.close();
    }
    
}
