import java.util.Scanner;

public class Q21RotateArrayLeftByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate left by one position.
        if (n > 0) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
