import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Austin on 7/20/2017.
 */
public class Problem14
{
    public static void main(String[] args)
    {
        int count = 1;
        int largestNum = 0;
        int largestCount = 1;
        long cur;
        Map<Integer, Integer> cache = new HashMap<>();
        for(int x = 2; x < 1000000; x ++)
        {
            System.out.println(x);
            cur = x;
            while(cur != 1L)
            {
                if(cache.get(cur) != null)
                {
                    count += cache.get(cur);
                    count --;
                    break;
                }
                if (cur % 2 == 0)
                {
                    cur /= 2;
                }
                else
                {
                    cur = 3 * cur + 1;
                }
                count ++;
            }
            if(count > largestCount)
            {
                largestNum = x;
                largestCount = count;
            }
            cache.putIfAbsent(x, count);
            count = 1;
        }
        System.out.println(largestNum);
    }
}
