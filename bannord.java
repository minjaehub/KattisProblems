import java.util.Scanner;
import java.util.HashSet;

public class bannord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();

        String word = scan.next();
        for (int i = 0; i < word.length(); i++) {
            hs.add("" + word.charAt(i));
        }

        // Consuming the newline left by the previous input
        scan.nextLine();

        String[] arr = scan.nextLine().split(" "); // Split by spaces for words
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (hs.contains("" + arr[i].charAt(j))) {
                    arr[i] = "*".repeat(arr[i].length());
                    break; // Exit the loop once a banned character is found
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
/*
 * import java.util.Scanner;
 * 
 * public class bannord {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * String letters = scanner.nextLine();
 * String text = scanner.nextLine();
 * String[] words = text.split(" ");
 * 
 * for (int i = 0; i < words.length; i++) {
 * for (char c : letters.toCharArray()) {
 * if (words[i].contains(Character.toString(c))) {
 * words[i] = "*".repeat(words[i].length());
 * break;
 * }
 * }
 * }
 * 
 * System.out.println(String.join(" ", words));
 * }
 * }
 */
