package Conditional_Thinking.Nested_Conditions;

import java.util.Scanner;

// 7. Take two numbers and determine whether both are even, both are odd, or one is
//    even and one is odd.


public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1%2==0 && num2%2==0){
            System.out.println("Both even");
        }
        else if (num1%2==0 || num2%2==0) {
            System.out.println("one even and one odd");
        }
        else{
            System.out.println("both odd");
        }

        sc.close();
        
    }
    
}
