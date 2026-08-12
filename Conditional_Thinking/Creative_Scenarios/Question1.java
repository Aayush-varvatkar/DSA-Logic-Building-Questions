package Conditional_Thinking.Creative_Scenarios;

import java.util.Scanner;

// 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.


public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x>0 && y>0) {
            System.out.println("1st quadrant");
        }
        else if (x>0 && y<0) {
            System.out.println("2nd quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println("3#rd quadrant");
        }
        else if (x<0 && y>0) {
            System.out.println("4th quadrant");
        }
        else if (x==0 && y==0) {
            System.out.println("origin");
        }
        else if (y==0) {
            System.out.println("X axis");
        }
        else if (x==0) {
            System.out.println("Y axis");
        }
        else{
            System.out.println("Invalid input");
        }

        sc.close();
    }
    
}
