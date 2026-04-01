package question5;

import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Random rand = new Random();

        for (int i = 0; i <20; i++) {
            nums[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 1; i <20; i += 2) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
