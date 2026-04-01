package question6;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть три дробові числа через пробіл: ");


        if (!scan.hasNextDouble()) {
            System.out.println("Помилка! Ви ввели не число.");
        } else {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double max = a;

            if (b>max) {
                max = b;
            }
            if (c>max) {
                max=c;
            }
            System.out.println("Найбільше число: " + max);


        }
    }
}
