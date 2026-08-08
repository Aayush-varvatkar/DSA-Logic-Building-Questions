package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// . Take a character and check if it is a letter, a digit, or neither


public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("is a letter");
        }
        else if (Character.isDigit(ch)) {
            System.out.println("is digit");
        }
        else{
            System.out.println("neither");
        }

        sc.close();
    }
    
}
