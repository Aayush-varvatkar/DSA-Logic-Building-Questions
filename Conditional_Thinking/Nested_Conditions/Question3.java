package Conditional_Thinking.Nested_Conditions;

import java.util.Scanner;

// take marks (0–100) and print the corresponding grade (A/B/C/D/F)

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Grades");
        int num = sc.nextInt();

        if (num >= 0 && num <= 100) {
            if (num <= 100 && num >= 90) {
                System.out.println("Grade A");
            } 
            else if (num < 90 && num >= 80) {
                System.out.println("Grade B");
            } 
            else if (num < 80 && num >= 70) {
                System.out.println("Grade C");
            } 
            else if (num < 70 && num >= 60) {
                System.out.println("Grade D");
            } 
            else {
                System.out.println("Grade F");
            }
        }

        else{
            System.out.println("Invalid Input");
        }

        sc.close();
    }

}
