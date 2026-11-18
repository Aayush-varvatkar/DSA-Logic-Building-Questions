package Looping_Pattern.Mathematical_Patterns;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit value");
        int nvalue = sc.nextInt();

        int square;

        for(int i=1; i<=nvalue; i++){
            // square = Math.pow(i,2 );       -- double datatype declaration
            square = i*i;
            System.out.println(square);
        }

        sc.close();
    }
    
}
