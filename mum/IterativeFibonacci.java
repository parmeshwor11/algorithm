package algorithm.mum;

/**
 * Created by parmeshwor on 1/14/16.
 */
public class IterativeFibonacci {

    public static void main(String[] args) {

       int n = 3;
       int k = fibo(n);
        System.out.println(k);
    }

    static int fibo(int n)
    {
        int fa=1,fb=1,f=0;
        if(n==1||n==2) return 1;

        for (int i=2;i<n;i++)
        {
            f = fa+fb;
            fa=fb;fb=f;
        }

        return f;
    }
}
