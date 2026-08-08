package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// Largest of Three Numbers


public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " a is largest");
        } else if (b > a && b > c) {
            System.out.println(b + " b is largest");
        }
        else{
            System.out.println(c + " c is largest");
        }

        sc.close();

    }
}
