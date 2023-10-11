import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        int i = 1;
        int count = 0;
        while (true) {
            sum = sum + i * i;
            if (a < sum) {
                System.out.println(count);
                break;
            } else {
                i = i + 2;
                count++;
            }
        }

    }

}
