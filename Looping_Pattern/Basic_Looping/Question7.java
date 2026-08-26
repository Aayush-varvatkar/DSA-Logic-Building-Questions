package Looping_Pattern.Basic_Looping;

import java.util.Scanner;

// 7. Print the sum of all even numbers up to n

public class Question7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any n numbers");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i%2 == 0) {
                sum += i;
                System.out.println(sum);
            }
        }

        sc.close();
    }
    
}
