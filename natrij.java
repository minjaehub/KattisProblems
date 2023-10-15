import java.util.Scanner;

public class natrij {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String currentT = scan.nextLine();
        String explosionT = scan.nextLine();
        String[] curT = currentT.split(":"); // {"20","0","0"}
        String[] expT = explosionT.split(":"); // {04:00:00}
        int a = Integer.parseInt(curT[0]);
        int b = Integer.parseInt(curT[1]);
        int c = Integer.parseInt(curT[2]);
        int d = Integer.parseInt(expT[0]);
        int e = Integer.parseInt(expT[1]);
        int f = Integer.parseInt(expT[2]);

        if (a == d && b == e && c == f) {
            System.out.print("24:00:00");
            System.exit(0);
        }
        if (a <= d) {
            d = d - a;
        } else {
            d = d + 24;
            d = d - a;
        }
        if (b <= e) {
            e = e - b;
        } else {
            d = d - 1;
            if (d < 0) {
                d = d + 24;
            }
            e = e + 60;
            e = e - b;
        }
        if (c <= f) {
            f = f - c;
        } else {
            e = e - 1;
            if (e < 0) {
                d = d - 1;
                if (d < 0) {
                    d = d + 24;
                    // d = d - a;
                }
                e = e + 60;
                // e = e - b;
            }
            f = f + 60;
            f = f - c;
        }
        String hr = Integer.toString(d);
        String min = Integer.toString(e);
        String sec = Integer.toString(f);
        String[] arr = { hr, min, sec };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 1) {
                arr[i] = "0" + arr[i];
            }
            System.out.print(arr[i]);
            if (i == arr.length - 1)
                break;
            System.out.print(":");
        }
        // System.out.print(hr + ":" + min + ":" + sec);
    }

}
