package algorithm.mum;

/**
 * Created by parmeshwor on 1/16/16.
 */
public class DynamicFibonacci {

    public static void main(String[] args) {

        int n = 6;
        int x = dynamicFibo(n);

        System.out.println("fibo at pos "+n+" ="+ x);
    }

    private static int dynamicFibo(int n) {

        int [] arr = new int[n+1];

        arr[1]=1;
        arr[2]=1;

        for(int i=3;i<=n;i++)
        {
            arr[i]= arr[i-1]+arr[i-2];
        }

        return arr[n];

    }
}
