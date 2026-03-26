package question2;

public class task2 {
    public static void main(String[] args) {
        int number = 47;
        int firstDigit = number / 10;
        int seconddigit = number % 10;
        int sum = firstDigit + seconddigit;
        System.out.println("Сума цифр числа " + number + " дорівнює: " + sum);
    }
}
