package question3;

public class task2 {
    public static void main(String[] args) {

        int n = 324;

        int digit1 = n / 100;
        int digit2 = (n / 10 ) % 10;
        int digit3 = n % 10;

        if (digit2 > digit1) {
            digit1 = digit2;
        }

        if (digit3 > digit1) {
            digit1 = digit3;
        }
        System.out.println("У числі "+ n +" найбільшою цифрою є: "+ digit1);
    }
}
