package question4;

public class task1 {
    public static void main(String[] args) {
        // Цикл for
        System.out.println("For:");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }

        // Цикл while
        System.out.println("\nWhile:");
        int i = 500;
        while (i <= 650) {
            System.out.print(i + " ");
            i += 10;
        }

        // Цикл do-while
        System.out.println("\nDo-while:");
        i = 500;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 650);
    }
}
