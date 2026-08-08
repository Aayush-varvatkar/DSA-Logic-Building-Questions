package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 6. Take two numbers and print the largest one


public class Question6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " Num1 is greater");
        }
        else{
            System.out.println(num2 + " Num2 is greater");
        }

        sc.close();
    }
    
}
