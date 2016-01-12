package algorithm.mum;

/**
 * Created by parmeshwor on 1/12/16.
 */
public class MergeSortedArray {

   static int [] A = {1,4,7,9};
   static int[] B = {2,3,4,10,11,12,13};
   static int sizeC = A.length+B.length;
    static int [] C = new int[sizeC];

    public static void main(String[] args) {

        merge(A,B);
        for(int x:C)
            System.out.print(x+" ");

    }

    private static void merge(int[] A, int[] B) {

        int count=0;
        int a=0;
        int b=0;
        while (count<sizeC)
        {
            if(A[a]<=B[b])
                C[count++]=A[a++];
            else
                C[count++]=B[b++];

                if (a == A.length)
                    while (b != B.length)
                        C[count++] = B[b++];
                if (b == B.length)
                    while (a != A.length)
                        C[count++]=A[a++];


        }
    }
}
