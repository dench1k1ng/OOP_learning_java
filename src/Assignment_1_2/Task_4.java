package Assignment_1_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("you don’t have to work.");
        }
        sc.close();
    }
}
