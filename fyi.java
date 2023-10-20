import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        if (a.charAt(0) == '5' && a.charAt(1) == '5' && a.charAt(2) == '5') {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
