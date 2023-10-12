import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (scan.nextInt() < 0)
                count++;
        }
        System.out.println(count);
    }
}
