package Looping_Pattern.Basic_Looping;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number ");
        int num = sc.nextInt();

        int temp = num;
        int digit;
        int product = 1;

        while (temp>0) {
            digit = temp % 10;

            product *= digit;
            
            temp /= 10;
        }
        System.out.println(product);


        sc.close();
    }
}
