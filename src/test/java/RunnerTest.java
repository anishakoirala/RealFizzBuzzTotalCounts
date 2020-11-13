import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RunnerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void main() {
        RealFizzBuzz fuzz = new RealFizzBuzz(20);
        Assert.assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz \n" +
                        "fizz: 4\n" +
                        "buzz: 3\n" +
                        "fizzbuzz: 1\n" +
                        "lucky: 2\n" +
                        "integer: 10"
                , outputStreamCaptor.toString()
                .trim());
    }
    @Test
    void lowRange()
    {
        RealFizzBuzz fuzz = new RealFizzBuzz(0);
        Assert.assertEquals("Range to low, please increase range parm to greater than 0"
                , outputStreamCaptor.toString()
                        .trim());
    }
}
