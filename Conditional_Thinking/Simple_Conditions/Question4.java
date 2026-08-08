package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 4. Check if a number is divisible by both 3 and 5

public class Question4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%3==0 && num%5==0) {
            System.out.println(num + " is divisible by both 3 and 5");
        }
        else{
            System.out.println(num + " is not divisible by both");
        }

        sc.close();
    }
    
}
