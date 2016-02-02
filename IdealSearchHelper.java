package algorithm;

/**
 * Created by parmeshwor on 1/23/16.
 */
public class IdealSearchHelper {

    private static int numDigits = 10;
    private static int val = 9999999;

    public static void main(String[] args) {

        // value to integer
        int arr[] = integerToArray(val,numDigits);
        for(int x:arr) System.out.print(x+" ");
    }

   private static int[] integerToArray(int val,int numDigits){

        int temp[] = new int[numDigits];

       for(int i=numDigits-1;i>=0;i--)
       {
           temp[i]=val%10;
           val = val/10;
       }
       return temp.clone();
   }
}
