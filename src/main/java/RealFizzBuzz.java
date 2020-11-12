public class RealFizzBuzz
{
    public RealFizzBuzz(int range)  {
        if (range <= 0) {
            System.out.println("Range to low, please increase range parm to greater than 0");
        }
        for (int x = 1;x<=range;x++)
        {
            if (x%15 == 0)
            {
                System.out.print("fizzbuzz ");
            }
            else if (x%5 == 0)
            {
                System.out.print("buzz ");
            }
            else if (x % 3 == 0)
            {
                System.out.print("fizz ");
            }
            else
                System.out.print(x + " ");
        }
    }
}
