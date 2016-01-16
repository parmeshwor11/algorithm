package algorithm.mum;

/**
 * Created by parmeshwor on 1/11/16.
 */
public class GCDNormal {

    public static void main(String []args){

        int m = 44;
        int n =0;
        // n should be less than m
        int gcd=1;

        for(int i=n;i>=1;i--)
        {
            if(n%i==0&&m%i==0)
            {
                gcd = i;
            }

        }
        System.out.println("gcd is :"+gcd);
    }


}

