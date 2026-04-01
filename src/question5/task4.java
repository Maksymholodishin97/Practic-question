package question5;

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] num3 = new int[10];

        for (int i = 0;i < 10; i++) {
            num1[i] = random.nextInt(11);
            num2[i] = random.nextInt(11);
            num3[i] = num1[i] + num2[i];
        }
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
    }
}
