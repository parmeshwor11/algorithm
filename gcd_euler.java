public class HelloWorld{

     public static void main(String []args){
       
       int num1 = 24;
       int num2 =7;
       
       int divisor,divident,rem=1,gcd;
       
       if(num1>num2){
           divisor = num2;
           divident = num1;
       }else{
           divisor = num1;
           divident = num2;
       }
       
      while(rem!=0){
          rem = divident%divisor;
          divident = divisor;
          divisor = rem;
         
      }
       System.out.println("gcd is :"+divident);
     }
}
