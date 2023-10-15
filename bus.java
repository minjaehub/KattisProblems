import java.util.Scanner;
import java.lang.*;

public class bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            int b = scan.nextInt();
            double total = 0;

            for (int j = 0; j < b; j++) {
                total = (total + 0.5) * 2;
            }
            int res = (int) total;
            System.out.println(res);
        }
    }
}
