/**
 * Created by Austin on 7/20/2017.
 */
public class Problem10
{
    public static void main(String[] args)
    {
        long sum = 0L;
        for(int x = 0; x < 2000000; x ++)
        {
            if(isPrime(x))
            {
                sum += x;
            }
        }
        System.out.println(sum - 1);
    }

    public static boolean isPrime(int n)
    {
        if(n == 2 || n == 3)
        {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }

        int i = 5, w = 2;
        while(i * i <= n)
        {
            if(n % i == 0)
            {
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }
}
