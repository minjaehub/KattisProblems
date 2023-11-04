import java.util.Scanner;

public class skruop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int init = 7;
        int a = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < a; i++) {
            if (scan.nextLine().equals("Skru op!")) {
                if (init < 10) {
                    init++;
                }
            } else {
                if (init > 0) {
                    init--;
                }
            }
        }

        System.out.println(init);
    }

}
