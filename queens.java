import java.util.Scanner;

public class queens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[][] arr = new int[a][2];

        for (int i = 0; i < a; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {

                if (arr[i][0] == arr[j][0] || arr[i][1] == arr[j][1]) {
                    System.out.println("INCORRECT");
                    System.exit(0);
                } else if (Math.abs(arr[i][0] - arr[j][0]) == Math.abs(arr[i][1] - arr[j][1])) {
                    System.out.println("INCORRECT");
                    System.exit(0);
                }

            }
        }
        System.out.println("CORRECT");
    }
}
