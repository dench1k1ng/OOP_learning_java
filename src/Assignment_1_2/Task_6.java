package Assignment_1_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Start of loop");
        while (true) {
            System.out.print("Enter: ");
            String s = sc.nextLine();
            if (s.equals("ENTER")) {
                System.out.println("It is end, the sum is " + sum);
                break;
            }
            sum += Integer.parseInt(s);
        }
        sc.close();
    }
}
