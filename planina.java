import java.util.Scanner;
import java.lang.*;

public class planina {
    public static void main(String[] args) {
        // optimized solution
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int res = (int) Math.pow((Math.pow(2, a) + 1), 2);
        System.out.println(res);
    }
}
