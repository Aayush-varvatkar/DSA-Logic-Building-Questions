package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 2. Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both


public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%3==0 && num%5==0) {
            System.out.println("FizzBuzz");
        }
        else if (num%3==0 ) {
            System.out.println("Fizz");
        }
        else if (num%5==0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
    
}
