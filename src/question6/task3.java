package question6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String text1 = sc.nextLine();

        System.out.println("Введіть другий рядок:");
        String text2 = sc.nextLine();

        int length1 = text1.length();
        int length2 = text2.length();

        if (length1 > length2) {
            System.out.println("Перший рядок довший. Кількість символів: " + length1);
        } else if (length2 > length1) {
            System.out.println("Другий рядок довший. Кількість символів: " + length2);
        } else {
            System.out.println("Рядки однакові за довжиною: " + length1);
        }
    }
}
