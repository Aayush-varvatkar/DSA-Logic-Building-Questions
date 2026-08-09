package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 10. Take a password string and check basic rules (length ≥ 8 and contains at least one digit)

public class Question10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password");
        String password = sc.next();

        boolean hasdigit = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasdigit = true;        
            }
        }

        if (password.length()>=8 && hasdigit == true) {
            System.out.println("Password satisfies the conditions");
        }
        else{
            System.out.println("Does not match the value");
        }



        sc.close();
    }
    
}
