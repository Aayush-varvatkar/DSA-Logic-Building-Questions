package Looping_Pattern.Basic_Looping;

import java.util.Scanner;

// 5. Print the table of a given number (n × 1 to n × 10)

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<=10; i++){
            int table = num * i;
            System.out.println(table);
        }

        sc.close();
    }
    
}
