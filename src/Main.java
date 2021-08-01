import java.util.Scanner ;
public class Main {
    public static void main ( String args[] ) {
        Scanner in = new Scanner ( System.in ) ;
            int t= in.nextInt();
            for(int i = 0;i<t;i++) {
                long n =in.nextInt();
                long m =in.nextInt();
                long a =in.nextInt();
                long d =in.nextInt();

                int count = 0 ;
                for(long j = n;i<=m;i++) {
                    if((i%a)!=0 || i%(a+d)!=0 || i %(a+2*d) !=0|| i%(a+3*d) !=0|| i%(a+4*d)!=0) count++;
                }
                System.out.println(count);
            }


    }
}