package Conditional_Thinking.LogicalStatements;


// 9. Take electricity units consumed and calculate the bill as per slabs (using if-else).


import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Electricity units consumed");
        int unit = sc.nextInt();

        if (unit>=0 && unit<=100) {
            System.out.println(unit * 3.96 + "is the Electrictiy bill");
        }
        else if (unit>100 && unit<=300) {
            System.out.println(unit * 10.80 + "is the Electrictiy bill");
        }
        else if (unit>300 && unit<=500) {
            System.out.println(unit * 15.03 + "is the Electrictiy bill");
        }
        else if (unit>500) {
            System.out.println(unit * 17.53 + "is the Electrictiy bill");
        }
        else{
            System.out.println("Invalid unit");
        }
        sc.close();
    }
    
}
