package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

// Check if a number lies within the range [100, 999].

public class Question8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num>=100 && num<=999) {
            System.out.println("number is in range");
        }
        else{
            System.out.println("not in range");
        }

        sc.close();
    }
    
}
