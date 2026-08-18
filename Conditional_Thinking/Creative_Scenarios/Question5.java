package Conditional_Thinking.Creative_Scenarios;
import java.util.Scanner;


// 5. Take three numbers and check if they are in arithmetic progression

// To be an arithmetic progression:  is a sequence of numbers in which the difference between any two consecutive terms is a constant value.
// For example: 3, 7, 11, 15, 19... is an AP because you add exactly 4 to get to the next number every single time (d = 4).


public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a-b == b-c) {
            System.out.println("arthmetic progression");
        }
        else{
            System.out.println("not ");
        }

        sc.close();

    }   

}
