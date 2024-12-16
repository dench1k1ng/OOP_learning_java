package Assignment_1_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        int age = sc.nextInt();

        if (18 <= age && age <= 28) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }
        sc.close();
    }
}
