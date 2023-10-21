import java.util.Scanner;

public class smil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        // char[] arr= new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ':' || a.charAt(i) == ';') {
                if ((i + 1 <= a.length() - 1) && a.charAt(i + 1) == ')') {
                    System.out.println(i);
                    i++;
                } else if ((i + 2 <= a.length() - 1) && (a.charAt(i + 1) == '-' && a.charAt(i + 2) == ')')) {
                    System.out.println(i);
                    i += 2;
                }
            }
        }
    }
}
