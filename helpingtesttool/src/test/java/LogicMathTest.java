import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LogicMathTest {
    private LogicMath logicMath = new LogicMath();

    @Test
    void plus() {
    double fin = logicMath.plus(2,8);
    assertEquals(10,fin);
    fin = logicMath.plus(-10,20);
    assertEquals(10, fin);
    fin = logicMath.plus(50,0);
    assertEquals(50, fin);

    }

    @Test
    void minus() {
        double fin = logicMath.minus(2,8);
        assertEquals(-6,fin);
        fin = logicMath.minus(30,20);
        assertEquals(10, fin);
        fin = logicMath.minus(0,50);
        assertEquals(-50, fin);
    }

    @Test
    void times() {
        double fin = logicMath.times(2,8);
        assertEquals(16,fin);
        fin = logicMath.times(-2,5);
        assertEquals(-10, fin);
        fin = logicMath.times(0,50);
        assertEquals(0, fin);
    }

    @Test
    void divide() {
        double fin = logicMath.divide(8,2);
        assertEquals(4,fin);
        fin = logicMath.divide(-10,-5);
        assertEquals(2, fin);
        fin = logicMath.divide(0,50);
        assertEquals(0, fin);
    }

    @Test
    void power() {
        double fin = logicMath.power(3,2);
        assertEquals(9,fin);
        fin = logicMath.power(-15,2);
        assertEquals(225, fin);
        fin = logicMath.power(0,5);
        assertEquals(0, fin);
    }

    @Test
    void factorial() {
        int fin = logicMath.factorial(5);
        assertEquals(120,fin);
        fin = logicMath.factorial(8);
        assertEquals(40320, fin);
        fin = logicMath.factorial(2);
        assertEquals(2, fin);


    }
}