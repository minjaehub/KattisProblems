
import java.util.Scanner;

public class smallestcalculatedvalue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Ari myAri = new Ari();

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int min = Integer.MAX_VALUE;

        int[] results = new int[] {
                myAri.plus(myAri.plus(a, b), c),
                myAri.plus(myAri.minus(a, b), c),
                myAri.plus(myAri.mul(a, b), c),
                myAri.plus(myAri.div(a, b), c),
                myAri.minus(myAri.plus(a, b), c),
                myAri.minus(myAri.minus(a, b), c),
                myAri.minus(myAri.mul(a, b), c),
                myAri.minus(myAri.div(a, b), c),
                myAri.mul(myAri.plus(a, b), c),
                myAri.mul(myAri.minus(a, b), c),
                myAri.mul(myAri.mul(a, b), c),
                myAri.mul(myAri.div(a, b), c),
                myAri.div(myAri.plus(a, b), c),
                myAri.div(myAri.minus(a, b), c),
                myAri.div(myAri.mul(a, b), c),
                myAri.div(myAri.div(a, b), c)
        };

        for (int result : results) {
            if (result >= 0 && result < min) {
                min = result;
            }
        }
        System.out.print(min);

    }

    public static class Ari {
        public int plus(int a, int b) {
            return a + b;
        }

        public int minus(int a, int b) {
            return a - b;
        }

        public int mul(int a, int b) {
            return a * b;
        }

        public int div(int a, int b) {
            if (b == 0 || a % b != 0) {
                return Integer.MAX_VALUE; // return a large value to ensure this isn't the minimum
            }
            return a / b;
        }
    }
}
