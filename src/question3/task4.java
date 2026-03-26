package question3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть відповідь: ");
        String respond = sc.nextLine();

        switch (respond) {
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюся!");
                break;

            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляся!");
                break;
        }

    }
}
