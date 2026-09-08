import java.util.Scanner;

public class Q23SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Track largest and second largest distinct values.
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > first) {
                second = first;
                first = value;
            } else if (value > second && value != first) {
                second = value;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println(second);
        }
        sc.close();
    }
}
