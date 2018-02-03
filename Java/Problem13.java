import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;

/**
 * Created by Austin on 7/20/2017.
 */
public class Problem13
{
    public static void main(String[] args) throws java.io.IOException
    {
        int sum = 0;
        int carry = 0;
        int digit = 0;
        Stack<Integer> s = new Stack<Integer>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\hrkin\\Desktop\\Code\\ProjectEuler\\problem13input.txt")));
        String [] nums = new String[100];
        for(int x = 0; x < 100; x ++)
        {
            nums[x] = reader.readLine();
        }
        for(int i = 49; i >= 0; i --)
        {
            for(String num : nums)
            {
                sum += Character.getNumericValue(num.charAt(i));
            }
            sum += carry;
            digit = sum % 10;
            carry = sum / 10;
            if(i <= 9)
            {
                s.push(digit);
            }
            sum = 0;
        }
        System.out.print(carry);
        while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }
    }
}
