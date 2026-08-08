package Conditional_Thinking.Math_NumberLogic;
import java.util.Scanner;


// 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.


public class Question2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first = num / 100;
        int middle = (num/10)%10;
        int last = num % 10;

        if (middle>first && middle>last) {
            System.out.println("middle digit is the largest");
        }
        else if(middle<first && middle<last){
            System.out.println("middle is the smallest");
        }
        else{
            System.out.println("Neither");
        }


        sc.close();



    }
    
}
