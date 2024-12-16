package Assignment_1_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        boolean isHigh = temperature < 35.0, isLow = temperature > 37.0;

        if (isLow) {
            System.out.print("The temperature is low");
        } else if (isHigh) {
            System.out.print("The temperature is high");
        } else {
            System.out.print("The temperature is normal");
        }
        sc.close();
    }
}
