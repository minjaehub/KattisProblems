
import java.util.Scanner;

public class ultimatebinarywatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String a = scan.nextLine();
        int num = scan.nextInt();
        int q = num / 1000;
        int w = (num % 1000) / 100;
        int t = (num % 100) / 10;
        int r = (num % 10);

        char[][] arr = new char[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2) {
                    arr[i][j] = ' ';
                } else {
                    arr[i][j] = '.';
                }
            }
        }

        int[] arr2 = { q, w, 0, t, r }; // {1,6,1,5}
        int a, b, c, d;
        int e, f, g, h;

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            a = arr2[i] / 2;
            b = a / 2;
            c = b / 2;
            d = c / 2;

            e = arr2[i] % 2;
            f = a % 2;
            g = b % 2;
            h = c % 2;
            if (h == 1)
                arr[i][0] = '*';
            if (g == 1)
                arr[i][1] = '*';
            if (f == 1)
                arr[i][2] = '*';
            if (e == 1)
                arr[i][3] = '*';

        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {

                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}