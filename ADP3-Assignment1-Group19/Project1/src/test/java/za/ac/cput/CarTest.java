package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Lyle Haines - 217245919
 * Group 19
 *Section B-4: Small program
 */
public class CarTest
{
   private Car car1;
   private Car car2;
   private Car car3;

    @BeforeEach
    public void setUp() {
        car1= new Car();
        car2= new Car();
        car3=car1;
    }

    @Test
    //Test expected to Fail
    public void fail() {
        System.out.println("This test is expected to fail");
        assertSame(car1, car2);
    }

    @Test
    //Test Same
    public void testIdentity() {
        System.out.println("This test will Pass if the Cars are the same");
        assertSame(car1, car3);
}
    @Test
    //Test NotSame
    public void testEquality() {
        System.out.println("This test will Pass if the Cars are not the same.");
        assertNotSame(car1, car2);
    }

}
