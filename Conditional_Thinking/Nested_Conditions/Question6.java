package Conditional_Thinking.Nested_Conditions;
import java.util.Scanner;


// 6. Check voting eligibility for a given age (18+).


public class Question6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>0 && age<200){
            if(age<18){
                System.out.println(" not Eligible for voting");
            }
            else{
                System.out.println(" Eligible for Voting");
            }
        }
        else{
            System.out.println("Invalid age");
        }

        sc.close();
    }
    
}
