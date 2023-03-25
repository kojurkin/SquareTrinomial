package org.example;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTrinomeTest {
    @Test
    public void zeroTest() throws Exception {
        SquareTrinome s = new SquareTrinome(0, 0, 0);
        assertThrows(Exception.class, s::Solution, "Infinity count of solutions");
    }
    @Test
    public void freeCoefficientTest() throws Exception {
        SquareTrinome s = new SquareTrinome(0, 0, 7);
        assertThrows(Exception.class, s::Solution, "No roots, oh no....");
    }
    @Test
    public void oneRootTest() throws Exception {
        SquareTrinome s = new SquareTrinome(0, 8, 64);
        List<Double> list = new ArrayList<Double>();
        list = s.Solution();
        assertEquals(-8, list.get(0));
        assertEquals(1, list.size());
    }
    @Test
    public void TwoRootTest() throws Exception {
        SquareTrinome s = new SquareTrinome(4, 64, -78);
        List<Double> list = new ArrayList<Double>();
        list = s.Solution();
        assertEquals(1.137, list.get(0), 0.001);
        assertEquals(-17.137, list.get(1), 0.001);
        assertEquals(2, list.size());
    }

}