public class HelloWorld{

     public static void main(String []args){
       
       int m = 24;
       int n =7;
       int gcd=1;
       
       for(int i=2;i<=n;i++)
       {
           if(n%i==0&&m%i==0)
           {
              gcd = gcd*i;
            m = m/i;
            n=n/i;
           }
            
       }
       System.out.println("gcd is :"+gcd);
     }
}
