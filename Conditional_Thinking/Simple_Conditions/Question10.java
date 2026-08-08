package Conditional_Thinking.Simple_Conditions;

import java.util.Scanner;

//  Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.

// 2 Approach

// 1. using Character Methods
// 2. using Strict approach

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is UpperCase");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is LowerCase");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is Digit");
        } else if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
            System.out.println(ch + " is Special Character");
        } else {
            System.out.println("Invalid Input");
        }

        // 2nd Approach


        // if (ch >= 'A' && ch <= 'Z') {
        //      System.out.println("UPPERCASE letter.");
        // } 
        // else if (ch >= 'a' && ch <= 'z') {
        //      System.out.println("LOWERCASE letter.");
        // } 
        // else if (ch >= '0' && ch <= '9') {
        //      System.out.println("DIGIT.");
        // } 
        // else {
        //      System.out.println("SPECIAL CHARACTER.");
        // }



        sc.close();
    }

}
