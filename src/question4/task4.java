package question4;

public class task4 {
    public static void main(String[] args) {
        // Використовуючи for
        long factFor = 1;
        for (int i = 1; i <= 10; i++) {
            factFor *= i;
        }
        System.out.println("Факторіал (for): " + factFor);

        // Використовуючи while
        long factWhile = 1;
        int j = 1;
        while (j <= 10) {
            factWhile *= j;
            j++;
        }
        System.out.println("Факторіал (while): " + factWhile);
    }
}
