package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 7. Take a single digit (0–9) and print its word form (“Zero” to “Nine”)

public class Question7 {

    public static void main(String[] args) {
        
        String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number frem 0 to 9");
        int num = sc.nextInt();

        if (num>=0 && num<=9) {
            System.out.println(numbers[num]);
        }
        else{
            System.out.println("invalid number");
        }

        sc.close();
    }
    
}
