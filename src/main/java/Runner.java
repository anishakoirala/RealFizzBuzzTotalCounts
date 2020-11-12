public class Runner {
    public static void main(String[] args)
    {
        try
        {
            int range = Integer.parseInt(args[0]);
            RealFizzBuzz fizz = new RealFizzBuzz(range);
        }
        catch (Exception e) {
            System.out.print("Please pass a range arg of greater than 0");
        }

    }
}
