package question6;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(101);
        System.out.println("Згенероване число: " + number);

        int count = String.valueOf(number).length();

        System.out.println("Кількість цифр у числі: " + count);
    }
}
