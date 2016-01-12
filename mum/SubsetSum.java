package algorithm.mum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parmeshwor on 1/11/16.
 */
public class SubsetSum {

    static int[] output = new int[5];
    static int index = 0;
    static List<int[]> li = new ArrayList<>();
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        subset(arr,0);


        // sum to 8  [1,3,4 :: 5,3]
        // sum to 6 [1,2,3 :: 2,4 ::  3,5]
        // number of subsets is 2^n so here 32



     for(int[] a : li)
     {
         System.out.println();
         System.out.print("{ ");
         for(int i=0;i<a.length;i++)
         {
             if(a[i]!=0)
             System.out.print(a[i]+", ");

         }
         System.out.print("}");
     }



    }

    static void subset(int[] arr, int length)
    {
        for(int i=length;i<arr.length;i++)
        {
            output[index++] = arr[i];
            li.add(output.clone());

            subset(arr, i + 1);

            output[--index]=0;

        }
    }
}
