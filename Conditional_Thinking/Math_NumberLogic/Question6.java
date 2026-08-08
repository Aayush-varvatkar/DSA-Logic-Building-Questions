package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

// 6. Take coordinates (x, y) and determine which quadrant the point lies in

public class Question6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x>0 && y>0) {
            System.out.println("First quadrant");
        }
        else if (x>0 && y<0) {
            System.out.println("Second quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println("Third quadrant");
        }
        else if (x<0 && y>0) {
            System.out.println("Fourth quadrant");
        }
        else if (x==0 && y==0) {
            System.out.println("Origin");
        }
        else{
            System.out.println("invalid input");
        }

        sc.close();
    }
    
}
