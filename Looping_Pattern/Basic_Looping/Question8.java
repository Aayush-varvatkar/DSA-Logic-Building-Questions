package Looping_Pattern.Basic_Looping;


// 8. Print the sum of all odd numbers up to n


import java.util.Scanner;

public class Question8 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any n numbers");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i%2 != 0) {
                sum += i;
                System.out.println(sum);
            }
        }

        sc.close();     
    }
    
}
