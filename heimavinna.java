import java.util.Scanner;
import java.lang.*;

public class heimavinna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] arr = a.split(";");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("-")) {
                String[] arr2 = arr[i].split("-");
                count += Integer.parseInt(arr2[1]) - Integer.parseInt(arr2[0]) + 1;
            } else {
                count++;
            }

        }
        System.out.println(count);

    }
}
