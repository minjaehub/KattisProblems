import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            int a = scan.nextInt();
            if (a == -1)
                break;
            int initial = 0;
            int total = 0;
            for (int i = 0; i < a; i++) {

                int speed = scan.nextInt();
                int time = scan.nextInt();
                total = total + (time - initial) * speed;
                initial = time;
            }
            System.out.println(total + " miles");
        }

    }
}
