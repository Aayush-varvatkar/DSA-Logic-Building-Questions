package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 1. Take a number and print whether it’s positive, negative, or zero.


public class Question1 {

    public static void main(String args[]){
        
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + "is positive");
        }
        else if (num < 0) {
            System.out.println(num + "is Negative");
        }
        else {
            System.out.println("num is zero" + num);
        }

        sc.close();

    }
    
}
