package Assignment_1_2;

public class Task_8 {
    public static void main(String[] args) {
//        int n = 0, sum = 0;
//        while (n < 100) {
//            n++;
//            if (n % 3 == 0) {
//                continue;
//            }
//            //System.out.println(n);
//            sum += n;
//        }
//        System.out.println(sum);
//    }
        //2 % 2 == 0
        System.out.println("2");
        System.out.println("3");
        System.out.println("5");
        for (int i = 6; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
