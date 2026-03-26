package question3;

public class task3 {
    public static void main(String[] args) {
        int currentFloor = 5;
        int targetFloor = 2;

        if (targetFloor == 2){
            if (targetFloor > currentFloor) {
                targetFloor = 3;
            } else {
                targetFloor = 1;
            }
        }
        if (targetFloor > currentFloor) {
            System.out.println("Ви піднялись на " + targetFloor + " поверх");
        } else if (targetFloor < currentFloor) {
            System.out.println("Ви спустились на " + targetFloor + " поверх");
        } else {
            System.out.println("Ви вже знаходитесь на " + targetFloor + " поверсі");
        }
    }
}
