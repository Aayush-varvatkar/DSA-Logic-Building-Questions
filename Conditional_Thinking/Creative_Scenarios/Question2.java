package Conditional_Thinking.Creative_Scenarios;

import java.util.Scanner;

// 2. Take three numbers and check if they can form a Pythagorean triplet.


public class Question2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>0 && b>0 && c>0) {
            if ((a*a + b*b == c*c) ||(a*a + c*c == b*b) || (c*c + b*b == a*a) ) {
                System.out.println("Satisfies the Pythagorean Theorem");
            }
            else{
                System.out.println("Does not satisfies the pythagorean theorem");
            }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
