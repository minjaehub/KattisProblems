import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = a - 1; i >= 0; i--) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }
}
