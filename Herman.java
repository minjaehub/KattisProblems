import java.util.Scanner;
import java.lang.Math;

public class Herman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double normal = Math.PI * a * a;
        double taxi = a * a * 2;
        System.out.printf("%.6f", normal);
        System.out.println(" ");
        System.out.printf("%.6f", taxi);

    }
}
