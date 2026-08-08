package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// . Take two numbers and check if both are positive and their sum is less than 100.

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>0 && num2>0) {
            if (num1+num2<=100) {
                System.out.println("both are positive and their sum is less than 100.");
            }
            else{
                System.out.println("sum is not less than 100.");
            }
        }
        else{
            System.out.println("not both numberrs are positive");
        }

        sc.close();
    }

}
