package Conditional_Thinking.Creative_Scenarios;

import java.util.Scanner;

// 6. Take three numbers and check if they are in geometric progression


public class Question6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b/a == c/b) {
            System.out.println("geometric progression");
        }
        else{
            System.out.println("not an geometric progression");
        }
        sc.close();
    }
}
