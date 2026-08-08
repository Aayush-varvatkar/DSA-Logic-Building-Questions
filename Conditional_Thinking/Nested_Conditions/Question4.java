package Conditional_Thinking.Nested_Conditions;
import java.util.Scanner;
 


// 4. Check if one of two given numbers is a multiple of the other.


public class Question4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        if (num1==0 || num2==0) {
            System.out.println("Zero cannot be multiplied by any number except zero... thus division by 0 is undefined");
        } 
        else if (num1%num2 == 0) {
            System.out.println(num1 + " is multiple of " + num2);
         }
         else if (num2%num1 == 0) { 
            System.out.println(num2 + " is multiple of " + num1);
         }
         else{
            System.out.println("number is not an multiple of other");
         }

      
         sc.close();

    }
    
}
