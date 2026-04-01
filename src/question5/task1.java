package question5;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[50];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = i * 2 + 1;
            System.out.println(arr[i]);
        }
    }

}
