package Conditional_Thinking.Creative_Scenarios;
import java.util.Scanner;


// 3. Take day and month and check if it forms a valid calendar date (ignoring leap years)


public class Question3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter month 1 to 12");
        int month = sc.nextInt();

        System.out.println("Enter valid Date");
        int date = sc.nextInt();


        // Approach 1


        int[] maxDaysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int validdays = maxDaysInMonth[month];
        
        if (month<=0 && month>12) {
            System.out.println("Invalid month of calender");
        }
        else if(date>0 && date<=validdays){
            System.out.println("valid day of calender");
        }
        else{
            System.out.println("invalid day");
        }





         

        // Approach 2
        

        // if (month>0 && month<12) {
        //     switch (month) {
        //         case 1,3,5,7,8,10,12:
        //             if (date >0 && date <=31 ) {
        //                 System.out.println("valid date of calander");
        //             }
        //             break;
        //         case 4,6,9,11:
        //             if (date>0 && date<=30) {
        //                 System.out.println("Valid date of calander");
        //             }
        //             break;
        //         case 2:
        //             if (date>0 && date<=28) {
        //                 System.out.println("Valid date of calander");
        //             }
        //             break;
        //         default:
        //                 System.out.println("invalid date");
        //             break;
        //     }
        // }
        // else{
        //     System.out.println("invalid month of the calender");
        // }



        sc.close();

    }
    
}
