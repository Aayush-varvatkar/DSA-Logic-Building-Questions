package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 3. Check if a number is divisible by 5


public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%5==0) {
            System.out.println(num + " is divisible by 5");
        }
        else{
            System.out.println(num + " is not divisible by 5");
        }

        sc.close();
    }
}
