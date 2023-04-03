package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void randomSuccessTest(){
        int min = 10;
        int max = 20;
        int res;
        System.out.println(res = Calc.random(min,max));
        Assertions.assertTrue(min <= res);
        Assertions.assertTrue(max >= res);
    }
    @Test
    public void addSuccessTest(){
        int expected = 3;
        Assertions.assertEquals(expected,Calc.add(1,2));
    }
    @Test
    public void subtractSuccessTest(){
        int expected = 3;
        Assertions.assertEquals(expected,Calc.subtract(5,2));
    }
    @Test
    public void multiplySuccessTest(){
        int expected = 3;
        Assertions.assertEquals(expected,Calc.multiply(1.5,2));
    }
    @Test
    public void divideSuccessTest(){
        int expected = 3;
        Assertions.assertEquals(expected,Calc.divide(6,2));
    }
    @Test
    public void divideExceptionTest(){
        Exception exception = Assertions.assertThrows(ArithmeticException.class,()->
                Calc.divide(5,0));
        Assertions.assertEquals("/ by zero",exception.getMessage());
    }
}
