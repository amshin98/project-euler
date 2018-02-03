/**
 * Created by Austin on 7/20/2017.
 */
public class Problem4
{
    public static void main(String[] args)
    {
        int ans = 0;
        int prod;
        for(int x = 999; x != 0; x --)
        {
            for(int y = 999; y != 0; y --)
            {
                prod = x * y;
                if(isPalindrome("" + prod))
                {
                    ans = Math.max(ans, prod);
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean isPalindrome(String s)
    {
        char[] word = s.toCharArray();
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
