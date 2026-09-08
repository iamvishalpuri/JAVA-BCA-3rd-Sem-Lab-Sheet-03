import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q24RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> unique = new LinkedHashSet<>();

        // Keep first occurrence of each element.
        for (int i = 0; i < n; i++) {
            unique.add(sc.nextInt());
        }

        for (int value : unique) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
