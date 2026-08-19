package Looping_Pattern.Basic_Looping;

// 3. Print all odd numbers between 1 and 100.

public class Question3 {

    public static void main(String[] args) {
        
        for(int i=0; i<=100; i++){
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
