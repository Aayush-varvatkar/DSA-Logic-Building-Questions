package Conditional_Thinking.Math_NumberLogic;
import java.util.Scanner;

    
// 3. Take a 4-digit number and check if the first and last digits are equal.


public class Question3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 4 Digit number");
        int num = sc.nextInt();

        int first = num/1000;
        int last = num%10;

        if (first == last) {
            System.out.println("First and the last digit are same");
        }
        else{
            System.out.println("Not same");
        }

        sc.close();


    }
    
}
