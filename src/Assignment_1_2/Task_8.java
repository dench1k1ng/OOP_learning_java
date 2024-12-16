package Assignment_1_2;

public class Task_8 {
    public static void main(String[] args) {
        int n = 0, sum = 0;
        while (n < 100) {
            n++;
            if (n % 3 == 0) {
                continue;
            }
            //System.out.println(n);
            sum += n;
        }
        System.out.println(sum);
    }
}
