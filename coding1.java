import java.lang.*;

public class coding1 {
    public static void main(String[] args) {
        System.out.println(reduce("eedaaad"));
        System.out.println(reduce("xxxtxxx"));
        System.out.println(reduce("uuuuxaaaaxuuu"));
        System.out.println(reduce("aaaaaaaa"));
        System.out.println(reduce(""));

    }

    public static String reduce(String S) {
        if (S.length() == 1 || S.length() == 2 || S.length() == 0)
            return S;
        String a = Character.toString(S.charAt(0)) + Character.toString(S.charAt(1));
        for (int i = 2; i < S.length(); i++) {

            if (!(S.charAt(i) == S.charAt(i - 1) && S.charAt(i - 1) == S.charAt(i - 2))) {
                a = a + Character.toString(S.charAt(i));
            }
        }
        return a;
    }

}
