package Conditional_Thinking.Math_NumberLogic;
import java.util.Scanner;


// 1. Take a 3-digit number and check if all digits are distinct.


public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a!=b && b!=c) {
        //     System.out.println("Digits are distinct");
        // }
        // else{
        //     System.out.println("Digits are distinct");
        // }



        // upper-one is wrong approach which takes three different inputs from user

        // below method is based on the only one input


        System.out.println("Enter three digit number");
        int num = sc.nextInt();

        int first = num/100;
        int middle = (num/10)%10;
        int last = num%10;


        if(first!=middle && middle!=last){
            System.out.println("Digits are Distinct");
        }
         else{
            System.out.println("Digits are distinct");
        }
        


        sc.close();
    }
    
}
