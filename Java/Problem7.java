/**
 * Created by Austin on 7/20/2017.
 */
public class Problem7
{
    public static void main(String[] args)
    {
        int count = 1;
        long num = 2L;
        boolean isPrime = true;
        while(count != 10001)
        {
            num ++;
            for(int x = 2; x <= Math.ceil(Math.sqrt(num)); x ++)
            {
                if(num % x == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            {
                count ++;
            }
            isPrime = true;
        }
        System.out.println(num);
    }
}
