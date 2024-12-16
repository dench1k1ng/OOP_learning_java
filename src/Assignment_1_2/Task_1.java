package Assignment_1_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        if (temperature < 0) {
            System.out.print("“it’s cold outside.");
        }
        else {
            System.out.print("it’s warm outside.");
        }
        sc.close();
    }
}
