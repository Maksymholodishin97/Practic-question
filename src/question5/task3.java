package question5;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int[] num3 = new int[5];

        int sum1 = 0;
        for (int i = 0; i < 5; i++) {
            num1[i] = random.nextInt(6);
            sum1 += num1[i];
        }
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            num2[i] = random.nextInt(6);
            sum2 += num2[i];
        }
        int sum3 = 0;
        for (int i = 0; i < 5; i++) {
            num3[i] = random.nextInt(6);
            sum3 += num3[i];
        }

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));

        double avg1 = sum1 / 5.0;
        double avg2 = sum2 / 5.0;
        double avg3 = sum3 / 5.0;

        System.out.println("Середні значення: " + avg1 + ", " + avg2 + ", " + avg3);

        if (avg1 > avg2 && avg1 > avg3) {
            System.out.println("Перший масив має найбільше середнє значення.");
        } else if (avg2 > avg1 && avg2 > avg3) {
            System.out.println("Другий масив має найбільше середнє значення.");
        } else if (avg3 > avg1 && avg3 > avg2) {
            System.out.println("Третій масив має найбільше середнє значення.");
        } else {
            System.out.println("Середні значення рівні (або є кілька однакових максимальних).");
        }
    }
}
