package algorithm.mum;

/**
 * Created by parmeshwor on 1/18/16.
 */
public class InsertionSort {



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
            int temp = i-1;
           while (temp>=0&&arr[i]<arr[temp]) temp --;

            swap (arr,i,temp+1);
        }

        // for loop implementation

    /*    for(int i=1;i<arr.length;i++){
            int min = i;
            for(int j=i-1;j>=0;j--){

                if(arr[i]<arr[j])
                    min = j;
            }

            swap(arr,i,min);
        }*/
    }

    private static void swap(int[]a,int i, int j) {

        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
