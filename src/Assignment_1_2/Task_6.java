package Assignment_1_2;

import java.net.SocketOption;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Start of loop");
        while (true) {
            System.out.print("Enter: ");
            if (sc.hasNextInt()) {
                sum = sum + sc.nextInt();
            } else  {
                if (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    if (line.equals("ENTER")) {
                        System.out.println("Sum of numbers is: " + sum);
                        break;
                    }
                    else {
                        System.out.println("Invalid input");
                    }
                }

            }
        }
        sc.close();
    }
}
