package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

// 4. Check whether a given integer is single-digit, double-digit, or multi-digit.

public class Question4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num>=0 && num<10) {
            System.out.println("single Digit");
        }
        else if (num>10 && num<100) {
            System.out.println("double");
        }
        else{
            System.out.println("multi Digit");
        }

        sc.close();
    }
}
