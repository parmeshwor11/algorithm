package algorithm.mum;

/**
 * Created by parmeshwor on 1/14/16.
 */
public class ZeroAndOneCounting {

    //given an array consisting of 0s and 1s count number of 0s and 1s

    static int[] a ={0,0,0,0,0,0,0,1,1,1,1,1};
    // search num
    static int numOne =1; // with 0 at on index less
    static int numZero=0;

    public static void main(String[] args) {

        int sum =0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }

        System.out.println("zero : "+(a.length-sum)+"  one: "+sum);

        //----------------------------------------------------



        int jump = a.length/4;
       int index= count(a,jump,jump);
        System.out.println("index : "+index+"  0's : "+index +" 1's: "+(a.length-index));
    }

    //search 1
    static int count(int[]a,int jump,int range){



        if(a[jump]==1)
        {
            for(int i=jump/2;i<jump;i++)
            {
                if(a[i]==1)
                    return i;
            }
        }
        else return count(a,jump+range,range);

        return a.length;
    }

}
