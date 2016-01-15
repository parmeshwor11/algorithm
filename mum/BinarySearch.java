package algorithm.mum;

/**
 * Created by parmeshwor on 1/14/16.
 */
public class BinarySearch {

    public static void main(String[] args) {


        int [] a= {2,4,5,6,7,8};
        int num = 6;

       int index= bsearch(0,a.length,num,a);
        System.out.println("index = " + index);
    }

    static int bsearch(int lo, int hi, int num, int[]a)
    {
        int mid = (lo+hi)/2;

        if(num==a[mid])
            return mid;

        else if(num<a[mid])
            return bsearch(lo,mid-1,num,a);
        else return bsearch(mid+1,hi,num,a);
    }
}
