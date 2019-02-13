package ac.za.cput.projects;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Tester test = new Tester();
    /**
     * Rigorous Test :-)
     */
    @Test

    public void add()
    {

        Assert.assertEquals(5, test.add(2,3));
    }
    @Test
    public void multiply(){
        Assert.assertEquals(30, test.multiply(10, 3));
    }

    @Test
    public void subtract(){
        Assert.assertEquals(7, test.subtract(15, 8));
    }

    @Test
    public void divide(){
        Assert.assertEquals(5, test.divide(10, 2));
    }

}
