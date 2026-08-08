package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

// . Check whether a number is a perfect square (without using the square root function)

public class Question10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit;

        for (int i = 1; i < num; i++) {
            digit = i*i;
            if (digit == num) {
                System.out.println( "the squareroot is " + i);
               break;
            }
            else if (digit > num) {
                 System.out.println(num + " does not have a perfect squsre");
                 break;
            }
        }

        sc.close();

    }
    
}
