package Looping_Pattern.Basic_Looping;

import java.util.Scanner;

// 9. Print the factorial of a given number


public class Question9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);


        sc.close();
    }
    
}
