package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 9. Take a character and check if it’s a vowel or consonant.


public class Question9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        if (character == 'a' || character == 'e'|| character == 'i'|| character == 'o'|| character == 'u' ) {
            System.out.println("Character is vowel");
        }
        else if (character == 'A' || character == 'E'|| character == 'I'|| character == 'O'|| character == 'U' ) {
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("consonent");
        }

        sc.close();
    }   
    
}
