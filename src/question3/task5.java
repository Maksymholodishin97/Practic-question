package question3;

public class task5 {
    public static void main(String[] args) {
        int a = 45;
        int b = 12;
        int c = 89;
        System.out.println("До сортування: a=" + a + ", b=" + b + ", c=" + c);

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Після сортування: " + a + ", " + b + ", " + c);
    }
}
