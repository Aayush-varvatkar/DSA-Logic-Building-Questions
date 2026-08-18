package Conditional_Thinking.Creative_Scenarios;
import java.util.Scanner;


// 8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits


public class Question8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number between 1 to 9999");
        int number = sc.nextInt();





        // Approach 1


        if (number < 0 && number > 9999) {
            System.out.println("Number out of bound");
        } else {

            int temp = number;
            int digit;
            int sum = 0;
            int product = 1;

            while (temp > 0) {
                digit = temp % 10;

                sum += digit;
                product *= digit;

                temp /= 10;
            }

            System.out.println(sum + " is the sum");
            System.out.println(product + " is the product");

            if (sum > product) {
                System.out.println("yes, sum is larger");
            } else {
                System.out.println("No, product is larger");
            }

        }








        // Approach 2nd



        // int num1 = (number/1000)%10;
        // int num2 = (number/100)%10;
        // int num3 = (number/10)%10;
        // int num4 = number%10;

        // // System.out.println(num1);
        // // System.out.println(num2);
        // // System.out.println(num3);
        // // System.out.println(num4);

        // if (number>=1000 && number<=9999) {

        // if (num1+num2+num3+num4 > num2*num3*num4*num1) {
        // System.out.println("yes");
        // }
        // else{
        // System.out.println("no");
        // }
        // }
        // else if (number>=100 && number<=999) {
        // if (num2+num3+num4 > num2*num3*num4) {
        // System.out.println("yes");
        // }
        // else{
        // System.out.println("no");
        // }
        // }
        // else if (number>=10 && number<=99) {
        // if (num3+num4 > num3*num4) {
        // System.out.println("yes");
        // }
        // else{
        // System.out.println("no");
        // }
        // }
        // else{
        // System.out.println("invalid");
        // }









        sc.close();
    }

}
