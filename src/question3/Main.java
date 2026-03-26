package question3;

public class Main {
    public static void main(String[] args){
        int n = 60;

        int start = 25;
        int end = 100;

        if (n > start && n < end) {
            System.out.println("Число "+ n + " міститься в проміжку (" + start + "; " + end + ")");
        }else {
            System.out.println("Число " + n + " не міститься в проміжку (" + start + "; " + end + ")");
        }
    }
}