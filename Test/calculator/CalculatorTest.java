package calculator;

import com.companyJD1.lecture30JUnit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator <Integer> calculator = new Calculator<>(3, 3);
        Assert.assertEquals("Incorrect sum", 6, calculator.add());
        calculator.setArg1(-1);
        calculator.setArg2(3);
        Assert.assertEquals("Incorrect sum", 2, calculator.add());
        calculator.setArg1(4);
        calculator.setArg2(2);
        Assert.assertEquals("Incorrect", 2, calculator.minus());
    }

    @Test
    public void addDoubleTest(){
        Calculator <Double> calculator = new Calculator<>(3.0, 3.0);
        Assert.assertEquals("Incorrect sum", 6, calculator.add());
        calculator.setArg1(-1.);
        calculator.setArg2(3.);
        Assert.assertEquals("Incorrect", -4, calculator.minus());
    }
}
