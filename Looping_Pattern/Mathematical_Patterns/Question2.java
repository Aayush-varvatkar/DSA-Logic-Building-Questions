package Looping_Pattern.Mathematical_Patterns;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit value");
        int nvalue = sc.nextInt();

        int cube;

        for (int i = 1; i <= nvalue; i++) {
            cube = i*i*i;
            System.out.println(cube);
        }

        sc.close();
    }
}
