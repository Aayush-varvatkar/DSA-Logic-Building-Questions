package Conditional_Thinking.Math_NumberLogic;

import java.util.Scanner;

// 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

public class Question7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount>0) {
            if (amount%100==0) {
                
                int remainingamount = amount;

                int note2000 = remainingamount / 2000;
                remainingamount =  remainingamount%2000;

                int note500 = remainingamount/500;
                remainingamount = remainingamount%500;

                int note100 = remainingamount/100;
                remainingamount=remainingamount%100;

                System.out.println("the amount is divided into " + note2000 + " 2000 notes " + note500 + " 500 notes and " + note100 + " 100 notes");

            }
            else{
                System.out.println("cannot be evenly divided");
            }
        }
        else{
            System.out.println("invalid imput amount");
        }

        sc.close();
    }
    
}
