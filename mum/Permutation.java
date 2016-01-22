package algorithm.mum;

/**
 * Created by parmeshwor on 1/19/16.
 */
public class Permutation {

    public static void main(String[] args) {

        String str = "abc";
       // System.out.println("str = " + str.substring(0,0)); // a ; substring(0) = abc

        permutation(str);
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
