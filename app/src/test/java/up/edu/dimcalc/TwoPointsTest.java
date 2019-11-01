package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static junit.framework.Assert.*;
import static org.junit.Assert.*;

public class TwoPointsTest {

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }
    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);
    }

    @Test
    public void randomValue() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.randomValue(0);
        Point p1 = testPoints.getPoint(0);
        int i = p1.x;
//        assertTrue((p1.x >= 10));
//        assertTrue(i >= -10);
//        assertTrue(i <= 10);
    }

    @Test
    public void setOrigin() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setOrigin(0);
        Point p1 = testPoints.getPoint(0);
        assertEquals(p1.x,0);
        assertEquals(p1.y,0);
    }

    @Test
    public void copy() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        testPoints.copy(0,1);
        assertEquals(p2.x,p1.x);
        assertEquals(p2.y,p1.y);
    }

    @Test
    public void distance() {
        TwoPoints testPoints = new TwoPoints();
    }

    @Test
    public void slope() {
        TwoPoints testPoints = new TwoPoints();
    }



}