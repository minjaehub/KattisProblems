import java.util.*;

public class buildinghighways {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int small;
        small = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += small + arr[i];
        }
        System.out.println(sum);
    }
}