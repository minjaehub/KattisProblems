import java.util.Scanner;

public class ullendullendoff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        String[] arr = scan.nextLine().split(" ");
        if (arr.length == 1) {
            System.out.println(arr[0]);
        } else if (arr.length >= 13) {
            System.out.println(arr[12]);
        } else {
            System.out.println(arr[13 % a - 1]);
        }

    }
}
