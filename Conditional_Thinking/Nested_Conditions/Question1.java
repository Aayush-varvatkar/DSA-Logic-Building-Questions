package Conditional_Thinking.Nested_Conditions;

import java.util.Scanner;

// 1. Take three sides and check if they form a valid triangle.


public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of side 1");
        int a = sc.nextInt();

        System.out.println("Enter length of side 2");
        int b = sc.nextInt();

        System.out.println("Enter length of side 3");
        int c = sc.nextInt();


        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("NOt a valid triangle");
        }

        sc.close();

    }

    
}
