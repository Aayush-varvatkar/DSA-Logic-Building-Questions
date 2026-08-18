package Conditional_Thinking.Creative_Scenarios;

import java.util.Scanner;

// 9. Take two dates (day and month) and determine which one comes first in the calendar

public class Question9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st date and month in DD/MM format");
        String i1 = sc.next();

        System.out.println("Enter 2nd date and month in DD/MM format");
        String i2 = sc.next();

        String[] date1 = i1.split("/");
        int d1 = Integer.parseInt(date1[0]);
        int m1 = Integer.parseInt(date1[1]);

        String[] date2 = i2.split("/");
        int d2 = Integer.parseInt(date2[0]);
        int m2 = Integer.parseInt(date2[1]);

        int[] maxDaysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if ((m1 < 0 || m2 < 0) || (m1 > 12 || m2 > 12)) {
            System.out.println("invalid month");
        }

        int validatedays1 = maxDaysInMonth[m1];
        int validatedays2 = maxDaysInMonth[m2];

        if ((d1 > 0 && d2 > 0) && (d1 <= validatedays1 && d2 <= validatedays2)) {
            if (m1 == m2) {
                if (d1 > d2) {
                    System.out.println("date 2 comes first");
                } 
                else if (d1==d2) {
                    System.out.println("both dates are same");
                }
                else {
                    System.out.println("date 1 comes first");
                }
            }
            else if (m1 > m2) {
                System.out.println("date 2 comes first");
            } 
            else {
                System.out.println("date 1 comes first");
            }
        } 
        else {
            System.out.println("invalid date");
        }

        sc.close();

    }

}
