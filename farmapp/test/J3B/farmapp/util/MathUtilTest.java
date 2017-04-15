package J3B.farmapp.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilTest {
    @Test
    public void testAdd() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(mathUtil.add(5, 4), 9);
    }
}