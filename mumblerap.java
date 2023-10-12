import java.util.Scanner;

public class mumblerap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine(); // consume the newline
        char[] arr = scan.nextLine().toCharArray();

        int maxNum = -1;
        int currentNum = 0;
        boolean isNum = false;

        for (int i = 0; i < num; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                currentNum = currentNum * 10 + (arr[i] - '0');
                isNum = true;
            } else {
                if (isNum) {
                    maxNum = Math.max(maxNum, currentNum);
                    currentNum = 0;
                    isNum = false;
                }
            }
        }
        if (isNum) {
            maxNum = Math.max(maxNum, currentNum);
        }
        System.out.println(maxNum);

    }
}
/*
 * import java.util.Scanner;
 * 
 * public class mumblerap {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * int num = scan.nextInt();
 * scan.nextLine(); // Consume the newline
 * char[] arr = scan.nextLine().toCharArray();
 * 
 * int maxNum = -1; // To store the max number
 * int currentNum = 0; // To store the currently being read number
 * boolean isNum = false; // To keep track if we are currently reading a number
 * 
 * for (int i = 0; i < num; i++) {
 * if (arr[i] >= '0' && arr[i] <= '9') {
 * // Multiplying by 10 and adding the new digit
 * currentNum = currentNum * 10 + (arr[i] - '0');
 * isNum = true;
 * } else {
 * if (isNum) { // Check if we just finished reading a number
 * maxNum = Math.max(maxNum, currentNum);
 * currentNum = 0;
 * isNum = false;
 * }
 * }
 * }
 * 
 * // Checking once more after the loop in case the string ended with a number
 * if (isNum) {
 * maxNum = Math.max(maxNum, currentNum);
 * }
 * 
 * System.out.println(maxNum);
 * }
 * }
 */
