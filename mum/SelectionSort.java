package algorithm.mum;

/**
 * Created by parmeshwor on 1/22/16.
 */

/*
* selection sort goes to find the index of smallest element and swap  it with the element
* with smallest index, and so on
* */
public class SelectionSort {

    public static void main(String[] args) {

        int [] a = {5,4,6,7,8,1,2,9};

        selectionSort(a);

        for(int x : a){
            System.out.print(x+" ");
        }
    }

    private static void selectionSort(int[] a) {

        for(int i=0;i<a.length;i++)
        {
            int x = findMinPos(a, i, a.length - 1);
            swap(a,x,i);
        }
    }

    private static int findMinPos(int[] a, int start, int end) {

        int pos = start;
        for(int i=start+1;i<=end;i++)
        {
            if(a[pos] >a[i])
            {
                pos = i;
            }
        }
        return pos;
    }

    private static void swap(int[]a,int i, int j) {

        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
