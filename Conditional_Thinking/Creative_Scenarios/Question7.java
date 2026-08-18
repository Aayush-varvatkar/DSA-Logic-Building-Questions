package Conditional_Thinking.Creative_Scenarios;
import java.util.Scanner;


// 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit


public class Question7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first = num/100;
        int middle = (num/10)%10;
        int last = num%10;


        if (first + last == middle) {
            System.out.println("condition Satisfied");
        }
        else{
            System.out.println("not satisfied");
        }


        // System.out.println(first);
        // System.out.println(middle);
        // System.out.println(last);


        sc.close();

    }
    
}
