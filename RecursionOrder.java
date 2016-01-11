package algorithm;

/**
 * Created by parmeshwor on 12/18/15.
 * Recursive program to find factorial of a number
 */
public class RecursionOrder {



    public static void main(String[] args) {

        int n = 5;
        int fact =  computeFactorial(n);
       // System.out.println("fact = " + fact);
    }

    private static int computeFactorial(int n) {

        if(n==0) return 1;
        int temp = n*computeFactorial(n-1);
        System.out.println("temp = " + temp);
        return temp;
    }
}
