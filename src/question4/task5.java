package question4;

public class task5 {
    public static void main(String[] args) {
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int h1 = h / 10; // перша цифра години
                int h2 = h % 10; // друга цифра години
                int m1 = m / 10; // перша цифра хвилини
                int m2 = m % 10; // друга цифра хвилини

                if (h1 == m2 && h2 == m1) {
                    count++;
                    System.out.printf("%02d:%02d\n", h, m);
                }
            }
        }
        System.out.println("Всього симетричних комбінацій: " + count);
    }
}
