package question5;

import java.util.Arrays;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] num = new int[15];

        for (int i = 0; i < 15; i++) {
            num[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(num));

        int evenCaunt = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                evenCaunt++;
            }
        }
        System.out.println("Кількість парних елементів у масиві: " + evenCaunt);
    }
}
