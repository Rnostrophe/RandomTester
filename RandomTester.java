import java.util.Random;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random x;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        x = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        System.out.println(x.nextInt(100));
    }
    
    public void printMultiRandom(int howmany)
    {
        int i = 0;
        while(i<howmany){
            System.out.println(x.nextInt(100));
            i ++;
        }
    }
}