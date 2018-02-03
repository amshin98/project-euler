/**
 * Created by Austin on 7/20/2017.
 */
public class Problem3
{
    public static void main(String[] args)
    {
        long largest = 0L;
        long N = 600851475143L;
        while(N > 1)
        {
            long d = pf(N);
            largest = Math.max(largest, d);
            N = N / d;
            System.out.println(d);
        }
        System.out.println(largest);
    }

    public static long pf(long z)
    {
        long x = 1L;
        long y = 2L;
        long d = 1L;
        while (d == 1L)
        {
            x = g(x, z);
            y = g((g(y, z)), z);
            d = gcd(Math.abs(x - y), z);
        }
        return d;
    }

    public static long g(long x, long n)
    {
        return((x * x + 1) % n);
    }

    public static long gcd(long a, long b)
    {
        while(a!=0 && b!=0) // until either one of them is 0
        {
            long c = b;
            b = a%b;
            a = c;
        }
        return a+b; // either one is 0, so return the non-zero value
    }
}
