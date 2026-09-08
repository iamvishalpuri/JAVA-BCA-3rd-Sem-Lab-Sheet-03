import java.util.Scanner;

public class Q1InputDisplayFiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Read 5 integers.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display entered integers.
        for (int value : arr) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
