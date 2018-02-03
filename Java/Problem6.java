/**
 * Created by Austin on 7/20/2017.
 */
public class Problem6
{
    public static void main(String[] args)
    {
        long sumSquares = 0L;
        long squaresSum = 0L;
        for(int x = 1; x <= 100; x ++)
        {
            sumSquares += x * x;
            squaresSum += x;
        }
        System.out.println((squaresSum * squaresSum)- sumSquares);
    }
}
