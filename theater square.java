import java.util.Scanner;
public class Myclass {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
         long m = sc.nextInt();
          long a = sc.nextInt();
          System.out.println(problem(n,m,a));
    }
    
   static  long  problem(long n, long m , long a){
        
        if(n%a==0 )
            n = n/a;
        else n = n/a + 1;
        if(m%a == 0)
            m = m/a;
        else m = m/a + 1;
        return n*m;
    }
}
