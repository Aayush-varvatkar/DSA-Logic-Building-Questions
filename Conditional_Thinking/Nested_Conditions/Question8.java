package Conditional_Thinking.Nested_Conditions;
import java.util.Scanner;


// 8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.


public class Question8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if(ch >= 'a' && ch <= 'm' ){
                System.out.println("lies between a and m");
            }
            else if (ch >= 'n' && ch <= 'z') {
                System.out.println("lies between n and z");
            }
        }
        else{
            System.out.println("invalid input");
        }

        sc.close();

    }
    
}
