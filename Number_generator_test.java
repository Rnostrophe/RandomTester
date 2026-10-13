import java.util.Random;
/**
 * Write a description of class Number_generator_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number_generator_test
{
    // instance variables - replace the example below with your own
    private Random x;

    /**
     * Constructor for objects of class Number_generator_test
     */
    public Number_generator_test()
    {
        // initialise instance variables
        x = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void generateNumber()
    {
        System.out.print(x.nextInt(100));
    }
}