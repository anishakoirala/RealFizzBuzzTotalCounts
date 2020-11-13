public class RealFizzBuzz
{
    public RealFizzBuzz(int range)  {
        int lucky = 0;
        int fizzbuzz = 0;
        int buzz = 0;
        int fizz = 0;
        int integer = 0;
        if (range <= 0) {
            System.out.println("Range to low, please increase range parm to greater than 0");
            return;
        }
        for (int x = 1;x<=range;x++)
        {
            if (Integer.toString(x).contains("3"))
            {
                System.out.print("lucky ");
                lucky++;
            }
            else if (x%15 == 0)
            {
                System.out.print("fizzbuzz ");
                fizzbuzz++;
            }
            else if (x%5 == 0)
            {
                System.out.print("buzz ");
                buzz++;
            }
            else if (x % 3 == 0)
            {
                System.out.print("fizz ");
                fizz++;
            }
            else {
                System.out.print(x + " ");
                integer++;
            }
        }
        System.out.println("");
        System.out.println("fizz: " + fizz);
        System.out.println("buzz: " + buzz);
        System.out.println("fizzbuzz: " + fizzbuzz);
        System.out.println("lucky: " + lucky);
        System.out.println("integer: " + integer);
    }
}
