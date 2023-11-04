import java.util.Scanner;

public class upprodun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int roomN = b / a;
        int left = b % a;
        for (int i = 0; i < a; i++) {
            if (left > 0) {
                System.out.print("*");
                left--;
            }
            for (int j = 0; j < roomN; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
