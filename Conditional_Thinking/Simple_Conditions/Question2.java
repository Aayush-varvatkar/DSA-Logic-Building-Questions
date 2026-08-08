package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 2. Check if a number is even or odd.


public class Question2 {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }

        sc.close();

    }
}
