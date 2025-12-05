// package Bluescopetasks;

import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        int option = 3;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("1. Start");
            System.out.println("2. Exit");
            option--;
        } while (option > 0);

        int[] nums = { 10, 20, 30, 40 };
        for (int n : nums) {
            System.out.println(n);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bala");
        names.add("Chitra");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
