import java.io.*;
import java.util.*;

public class quiteaproblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        boolean check = false;
        while (line != null) {

            String[] result = line.toLowerCase().split(" ");

            for (int i = 0; i < result.length; i++) {
                if (result[i].contains("problem")) {
                    check = true;
                    break;
                }
            }
            bw.write(check ? "yes\n" : "no\n");
            line = br.readLine();
            check = false;
        }
        bw.close();
        br.close();

    }
}
