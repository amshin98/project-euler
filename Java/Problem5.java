/**
 * Created by Austin on 7/20/2017.
 */
public class Problem5
{
    public static void main(String[] args)
    {
        int num = 1;
        boolean flag = true;
        while(flag)
        {
            flag = false;
            for(int x = 1; x <= 20; x ++)
            {
                if(num % x != 0)
                {
                    flag = true;
                }
            }
            num += 1;
        }
        System.out.println(num - 1);
    }
}
