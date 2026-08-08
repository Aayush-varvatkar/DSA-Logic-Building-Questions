package Conditional_Thinking.LogicalStatements;

import java.util.Scanner;

// 3. Take three numbers and print the median value (neither maximum nor minimum)

public class Question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // Approach 1

        if ((a<b && a>c) || (a>b && a<c)) {
            System.out.println(a + " is median value");
        }
        else if ((b<a && b>c) || (b>a && b<c)) {
            System.out.println(b + " is median value");
        }
        else if ((c<a && c>b) || (c>a && c<b)) {
            System.out.println(c + " is median value");
        }
        else if(a==b || b==c || a==c){
            System.out.println(" valuse are eqaual.. Thus no median");
        }
        else{
            System.out.println("Invalid input");
        }


        sc.close();

    }
    
}
