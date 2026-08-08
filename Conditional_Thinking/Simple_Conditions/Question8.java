package Conditional_Thinking.Simple_Conditions;
import java.util.Scanner;


// 8.  Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.


public class Question8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temp in celcius");

        int temp = sc.nextInt();

        if(temp>30){
            System.out.println("Temp is hot");
        }
        else if(20<=temp && temp<=30){
            System.out.println("temp is warm");
        }
        else{
            System.out.println("cold temp");
        }

        sc.close();
    }
    
}
