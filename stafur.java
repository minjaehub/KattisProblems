import java.io.*;

public class stafur {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        if (word.equals("A") || word.equals("E") || word.equals("I") || word.equals("O") || word.equals("U")) {
            bw.write("Jebb");
        } else if (word.equals("Y"))
            bw.write("Kannski");
        else {
            bw.write("Neibb");
        }
        bw.close();
        br.close();
    }

}
