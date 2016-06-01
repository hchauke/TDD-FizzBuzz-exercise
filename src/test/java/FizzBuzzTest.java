import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testOneReturnsOne() throws NumberNotAllowedException {
        String tempNumber = fizzBuzz.getNumber(1);
        Assert.assertEquals("1",tempNumber);
    }

    @Test
    public void testTwoReturnTwo() throws NumberNotAllowedException {
        String tempNumber = fizzBuzz.getNumber(2);

        Assert.assertEquals("2", tempNumber);
    }

    @Test
    public void testThreeReturnFizz() throws NumberNotAllowedException {
        String fizz = fizzBuzz.getNumber(3);
        Assert.assertEquals("Fizz",fizz);

    }


    @Test
    public void testFiveReturnBuzz() throws NumberNotAllowedException {
        String buzz = fizzBuzz.getNumber(5);

        Assert.assertEquals("Buzz", buzz);
    }

    @Test
    public void testNineReturnFizz() throws NumberNotAllowedException {
        String fizz = fizzBuzz.getNumber(9);
        Assert.assertEquals("Fizz", fizz);
    }

    @Test
    public void testTenReturnBuzz() throws NumberNotAllowedException {
       String buzz = fizzBuzz.getNumber(10);
       Assert.assertEquals("Buzz", buzz);
    }


    @Test
    public void testFifteenReturnsFizzBuzz() throws NumberNotAllowedException {
        String fizzAndBuzz = fizzBuzz.getNumber(15);
        Assert.assertEquals("FizzBuzz", fizzAndBuzz);

    }

    @Test
    public void testHundredReturnsBuzz() throws NumberNotAllowedException {
        String buzz= fizzBuzz.getNumber(100);
        Assert.assertEquals("Buzz", buzz);

    }

    @Test
    public void testHundredOneThrowsException() throws NumberNotAllowedException {
        thrown.expect(NumberNotAllowedException.class);
        thrown.expectMessage("We are accepting only numbers from 1 to 100");
        fizzBuzz.getNumber(101);
    }
}

