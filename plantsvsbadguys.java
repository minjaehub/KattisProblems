import java.io.*;
import java.util.*;

public class plantsvsbadguys {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int smallest = Integer.MAX_VALUE;

        String[] arr = new String[a];
        arr = br.readLine().split(" ");

        for (int i = 0; i < a; i++) {

            int b = Integer.parseInt(arr[i]);
            if (b < smallest) {
                smallest = b;
            }
        }
        // bw.write(smallest + 1);
        // bw.close();
        // br.close();
        System.out.println(smallest + 1);
    }
}
