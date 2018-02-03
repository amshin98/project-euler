/**
 * Created by Austin on 7/20/2017.
 */
public class Problem2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int a = 1;
        int b = 2;
        int temp;
        while(b <= 4000000)
        {
            if (b % 2 == 0)
            {
                sum += b;
            }
            temp = b;
            b += a;
            a = temp;
        }
        System.out.println(sum);
    }
}
