/**
 * Created by Austin on 7/20/2017.
 */
public class Problem9
{
    public static void main(String[] args)
    {
        double c;
        for(int a = 1; a < 1000; a ++)
        {
            for(int b = 1; b < 1000; b ++)
            {
                c = Math.sqrt(a * a + b * b);
                if(c % 1 == 0)
                {
                    if(a + b + c == 1000.0)
                    {
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        break;
                    }
                }
            }
        }
    }
}
