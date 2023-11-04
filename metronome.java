import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // optimized solution
        double a = scan.nextInt();
        a /= 4;
        System.out.printf("%.2f", a);
        /*
         * int a = scan.nextInt();
         * double b = (double) a;
         * b = b / 4.0;
         * System.out.println(b);
         */
    }

}
