package Assignment_1_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int multiple = sc.nextInt();
        if (start <= end) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += i;
                if (sum % multiple == 0) {
                    System.out.println("Sum of numbers is multiple if multiples " + sum + " multiple to " + multiple);
                }
            }

        }
    }
}
