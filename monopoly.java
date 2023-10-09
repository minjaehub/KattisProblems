import java.util.Scanner;
import java.util.HashMap;

public class monopoly {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                hm.put(i + j, hm.getOrDefault(i + j, 0) + 1);
            }
        }

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            int b = scan.nextInt();
            count += hm.get(b);
        }
        Double total = (double) count;
        System.out.println(total / 36.0);
    }
}
