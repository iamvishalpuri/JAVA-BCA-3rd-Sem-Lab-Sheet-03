import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q22ElementFrequencyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> frequency = new LinkedHashMap<>();

        // Count frequency preserving insertion order.
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        sc.close();
    }
}
