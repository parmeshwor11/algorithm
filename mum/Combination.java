package algorithm.mum;

/**
 * Created by parmeshwor on 1/11/16.
 */
public class Combination {

    static private StringBuilder output = new StringBuilder();
    static String inputStr = "abcd";

    public static void main(String[] args) {



        combination(new StringBuilder(inputStr),0);

    }

    private static void combination(StringBuilder str, int length) {

        if(length >= inputStr.length())
            return;

        for(int i=length;i<inputStr.length();i++)
        {
            output.append(str.charAt(i));
            System.out.println("output = " + output);
            combination(str, i + 1);
            output.setLength(output.length()-1);
        }

    }


}
