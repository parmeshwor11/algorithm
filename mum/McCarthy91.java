package algorithm.mum;

public class McCarthy91{

     public static void main(String []args){
     
        int x = 0;
        System.out.println(carthy(x));
        
        
     }
     static int carthy(int x){
         if(x>100)
         return x-10;
         
         return carthy(carthy(x+11));
     }
}
