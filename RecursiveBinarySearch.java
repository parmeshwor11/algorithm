package algorithm;

/**
 * Created by parmeshwor on 12/18/15.
 */
public class RecursiveBinarySearch {

    static int[] arr = {0,1,2,3,4,5,6,7,8};

    static int[] arr2 = {0,1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        int x = -1;
        int start=0, end = arr2.length-1;
      int index = search(arr2,x,start,end);
        System.out.println("index = " + index);
    }

    private static int search(int[] arr, int x, int start, int end) {

        int mid = (start+end)/2;
        if(end<start)
            return -1;
        if(x==arr[mid])
            return mid;
        else if(x>arr[mid])
            return search(arr,x,mid+1,end);
        else
            return search(arr,x,start,mid-1);


    }
}
