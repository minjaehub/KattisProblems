import java.util.Scanner;
import java.lang.Math;

public class vefthjonatjon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        int[] arr = { 0, 0, 0 };
        for (int i = 0; i < a; i++) {
            String[] ar = scan.nextLine().split(" ");
            if (ar[0].equals("J")) {
                arr[0]++;
            }
            if (ar[1].equals("J")) {
                arr[1]++;
            }
            if (ar[2].equals("J")) {
                arr[2]++;
            }
        }
        System.out.println(Math.min(Math.min(arr[0], arr[1]), arr[2]));
        // Math.min takes only two parameters. Can't be more than 2.
    }
}
