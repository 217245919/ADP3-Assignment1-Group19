/*
*Group19
 * Keallan Saunders 219169357
 * SECTION B :::::: SMALL TDD Program
 * 30 March 2022
 * CarIgTest.java   +   CarIg.java
 * ADP3 ASSIGNMENT 1
 * */

package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarIgTest {
    @Test
    public void ignitionOn(){
        CarIg cg = new CarIg();
        assertEquals(0.0, cg.getIgon(), 0.0);
        System.out.println("VW Ignition is Now Turned On");

    }
    @Test
    public void ignitionOff(){
        CarIg bb = new CarIg();
        assertEquals(5.0, bb.getIgOff(), 0.0);
        System.out.println("VW Igntion is now Turned Off");
    }
}