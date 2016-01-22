package algorithm.mum;

/**
 * Created by parmeshwor on 1/18/16.
 */
public class InsertionSort {

/*
* in insertion sort , array upto nth position is sorted in nth iteration, I(i) i.e its loop invariant
* */

    public static void main(String[] args) {

        int [] arr = {3,6,4,1,2,5,7,8};

        sort(arr);

        for(int k:arr){
            System.out.print(k+" ");
        }
    }

    private static void sort(int[] arr) {

        // using while loop; here we can observe best case of Insertion sort ie. O(n)
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
           while (j>=0&&temp<arr[j]) {
               arr[j+1]=arr[j];
               j --;
           }

            arr[j+1]=temp;
        }
    }
}
