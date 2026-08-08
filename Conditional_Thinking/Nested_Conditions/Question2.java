package Conditional_Thinking.Nested_Conditions;
import java.util.Scanner;



// If Valid Triangle, check whether equilateral, isosceles, or Scalene



public class Question2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter length of side 1");
        int a = sc.nextInt();

        System.out.println("Enter length of side 2");
        int b = sc.nextInt();

        System.out.println("Enter length of side 3");
        int c = sc.nextInt();


        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            if ((a==b) && (b==c)) {
                System.out.println("Equliteral Triangle");  
            }
            else if((a==b) || (a==c) || (b==c)){
                System.out.println("Isoceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }
        }
        else{
            System.out.println("Invalid Triangle");
        }
        

        sc.close();


    }
    
}
