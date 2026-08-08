package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

// 5. Check if a number is a multiple of 7 or ends with 7


public class Question5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int last = num%10;

        if (num%7==0 ) {
            System.out.println("number is multiple of 7 ");
        }
        else if(num%10==7){
            System.out.println("last digit is 7");
        }
        else{
            System.out.println("neither");
        }

        sc.close();


    }
    
}
