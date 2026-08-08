package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

public class Question5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int income = sc.nextInt();


        if (age>0 && age>0) {
            if (age>18 && income>500000) {
                System.out.println("Eligible for tax");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("invalid");
        }

        sc.close();

    
    }
    
}
