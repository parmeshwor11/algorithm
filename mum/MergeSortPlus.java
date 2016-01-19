package algorithm.mum;

/**
 * Created by parmeshwor on 1/18/16.
 */
public class MergeSortPlus {

    public static void main(String[] args) {

        int n = 10000;
        int [] a = new int[n];
        int [] aux = new int[n];
        for(int i=100;i>0;i--)
        {
            a[n-i] = i;
        }
        // unsorted
     /*   for(int x:a)
            System.out.print(x + " ");*/

        // merge

        long t1 = System.currentTimeMillis();
        mergeSortPlus(a, aux, 0, n - 1);
        long t2 = System.currentTimeMillis();
        mergeSort(a, aux, 0, n - 1);
        long t3 = System.currentTimeMillis();

        System.out.println("mergePlus  :: size " +n+  " time :  "+(t2-t1));
        System.out.println("merge Sort :: size : "+n+ " time : "+(t3-t2));

        //insertionSort(a,0,n-1);
      /*  System.out.println("========================== ");
        for(int x:a)
            System.out.print(x + " ");*/

    }

    static void mergeSortPlus(int[] A,int[] Aux,int lo, int hi){

        if(hi<=lo+8)
        {
            insertionSort(A,lo,hi);

            return;
        }


        int mid = lo + (hi - lo) / 2;
        mergeSortPlus(A, Aux, lo, mid);
        mergeSortPlus(A, Aux, mid + 1, hi);
        merge(A, Aux, lo, mid, hi);

    }

    static void mergeSort(int[] A,int[] Aux,int lo, int hi){

        if(hi<=lo)
            return;

        int mid = lo + (hi - lo) / 2;
        mergeSort(A, Aux, lo, mid);
        mergeSort(A, Aux, mid + 1, hi);
        merge(A,Aux,lo,mid,hi);

    }
    private static void insertionSort(int[] arr, int lo, int hi) {

        for(int i=lo;i<hi;i++){
            // int x = arr[i];
            int j = i+1;
            int x = arr[j];

            while(j>lo)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];


                    arr[j-1]=temp;
                }
                j--;

            }

        }
    }

    private static void merge(int[] a, int[] aux,int lo, int mid, int hi) {

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo; int j = mid+1;

        for(int k=lo;k<=hi;k++){
            if(i>mid)                 a[k] = aux[j++];
            else if(j>hi)             a[k] = aux[i++];
            else if (aux[j]<aux[i])   a[k] = aux[j++];
            else                      a[k] = aux[i++];
        }
    }

}
