import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (a.length() >= b.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
