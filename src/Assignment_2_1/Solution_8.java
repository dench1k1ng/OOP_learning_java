package Assignment_2_1;

public class Solution_8 {
    public static void main(String[] args) {
        int[][] multiplication_table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplication_table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiplication_table[i][j] + " ");
            }
            System.out.println();
        }
    }

}
