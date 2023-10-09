import java.util.Scanner;

public class beavergnaw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            double d;
            int intD = scan.nextInt();
            int intV = scan.nextInt();

            if (intD == 0 && intV == 0)
                break;

            Double D = (double) intD;
            Double V = (double) intV;

            d = Math.pow((Math.pow(D, 3) - 6 * V / Math.PI), 1.0 / 3.0);
            System.out.printf("%.9f%n", d);
        }
    }
}
