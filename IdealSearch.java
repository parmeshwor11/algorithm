package algorithm;

/**
 * Created by parmeshwor on 1/23/16.
 */
public class IdealSearch {

    static int numDigits = 10;
    private static Node root = Node.get();



    public static void main(String[] args) {

      /*  for(int x: Node.arr)
        {
            System.out.print(x + " ");
        }*/
    }

    private static void traverse(){

     for(int i = 0;i<numDigits;i++)
     {
         
     }

    }

    private static void insert(int val)
    {
        int i=0;
        int digitArr[] = integerToArray(val,numDigits);
        int lastIndexVal = digitArr[digitArr.length-1];


        // loops 10 times
      while (i<digitArr.length-1){
          if(root.arr[digitArr[i]]==null)
          {
              root.arr[digitArr[i]] = Node.get();

          }else {
              root = root.arr[digitArr[i]];
          }
          i++;
      }

       root.arr[lastIndexVal]=root;
    }

    private static class Node{

        Node arr[];
        //Node next;
        private Node(){
           // next = null;
            this.arr = new Node[10];
            for(Node n : arr)n=null;
        }

        // return node initialized with null
        static Node get()
        {
            return new Node();
        }

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


