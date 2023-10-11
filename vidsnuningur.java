import java.util.Scanner;

public class vidsnuningur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        String a = scan.nextLine();
        String[] arr = new String[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = Character.toString(a.charAt(i));
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}