package Conditional_Thinking.Creative_Scenarios;
import java.util.Scanner;


// 4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.


public class Question4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hour of the clock (0 to 24)");
        int hour = sc.nextInt();

        System.out.println("Enter minute");
        int minute = sc.nextInt();

        if (hour>12 && hour<=24) {
            hour = hour%12;
        }
        
        if ((hour<0 && hour>24) && (minute<=0 && minute>60)) {
            System.out.println("invalid hour");
        }
        else{

            double hourAngle = (hour*30) + (minute*0.5);
            int minuteAngel = minute*6;

            double Angle = hourAngle - minuteAngel;
            System.out.println(Angle);

            if (Angle>180) {
                double SmallerAngle = 360 - Angle;
                System.out.println(SmallerAngle);
            }


            // System.out.println(hourAngle);
            // System.out.println(minuteAngel);
        }

        sc.close();
    }
    
}
