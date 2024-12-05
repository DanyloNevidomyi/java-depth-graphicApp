package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void testFunctionCalculation() {
        assertEquals(0.0, Function.f(1), 0.001);
        assertEquals(-1.0, Function.f(2), 0.001);
        assertEquals(0.0, Function.f(3), 0.001);
    }

    @Test
    void testDerivativeCalculation() {
        assertEquals(-2.0, Function.df(1), 0.001);
        assertEquals(0.0, Function.df(2), 0.001);
        assertEquals(2.0, Function.df(3), 0.001);
    }

    @Test
    void testExtremumFinding() {
        double[] extremum = Function.findExtremum();
        assertEquals(2.0, extremum[0], 0.001); // x екстремуму
        assertEquals(-1.0, extremum[1], 0.001); // y екстремуму
    }

}