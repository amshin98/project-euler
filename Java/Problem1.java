/**
 * Created by Austin on 7/20/2017.
 */
public class Problem1
{
    public static void main(String[] args)
    {
        int sum = 0;
        int x = 0;
        while(x < 1000)
        {
            if(x % 3 == 0 || x % 5 == 0)
            {
                sum += x;
            }
            x ++;
        }
        System.out.println(sum);
    }
}
