package Bluescopetasks;

import java.util.*;

public class Conditionalstmt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = s.nextInt();
        if (mark >= 90) {
            System.out.println("Awesome! Your grade is 'O'");
        } else if (mark < 90 && mark >= 70) {
            System.out.println("Excellent! Your grade is 'A'");
        } else if (mark < 70 && mark >= 50) {
            System.out.println("Very Good! Your grade is 'B'");
        } else if (mark < 50 && mark >= 40) {
            System.out.println("Good! Your grade is 'C'");
        } else {
            System.out.println("Sorry! You are fail");
        }
        s.close();
    }
}
