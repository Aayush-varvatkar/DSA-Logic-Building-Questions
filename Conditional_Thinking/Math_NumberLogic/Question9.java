package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

//  Take two angles of a triangle and compute the third angle

public class Question9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float a1 = sc.nextFloat();
        float a2 = sc.nextFloat();

        float a3;

        if ((a1+a2)<180) {
            a3 = 180 - (a1+a2);
            System.out.println("third angle is " + a3);
        }
        else{
            System.out.println("invalid triangle");
        }

        sc.close();

        
    }
    
}
