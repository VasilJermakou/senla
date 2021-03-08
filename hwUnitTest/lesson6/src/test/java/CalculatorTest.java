/*
 * Copyright (c) Created by Vasil Ermakov
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {

    /**
     * Methods name writes in conception WhenSmtThenResultIsSmt
     * Methods body writes in conception AAA (arrange, act, assert)
     * */

    //class fields
    private Calculator calculator;
    private int result;

    //create new object of Calculator and init result variable
    @Before
    public void beforeMethod(){
        calculator = new Calculator();
        result = 0;
    }

    //reinit result variable after other methods work
    @After
    public void afterMethod(){
        result = 0;
    }

    // '+'
    @Test
    public void WhenFirstSumSecondThenResultIs4(){
        calculator = new Calculator();
        result = calculator.sum(2,2);
        assertThat(result, is(4));
    }

    // '-'
    @Test
    public void WhenFirstSubTractionSecondThenResultIs2(){
        calculator = new Calculator();
        result = calculator.subtraction(4,2);
        assertThat(result, is(2));
    }

    // '*'
    @Test
    public void WhenFirstMultiplySecondThenResultIs8(){
        calculator = new Calculator();
        result = calculator.multiply(4,2);
        assertThat(result,is(8));
    }

    // '/'
    @Test
    public void WhenFirstDivSecondThenResultIs5(){
        calculator = new Calculator();
        result = calculator.division(15, 3);
        assertThat(result, is(5));
    }

    // Exception
    @Test(expected = ArithmeticException.class)
    public void WhenDivOnZeroThenExpectedArithmeticException(){
        calculator = new Calculator();
        result = calculator.division(15, 0);
    }

    // Null
    @Test
    public void WhenDivThenResultNotNull(){
        calculator = new Calculator();
        result = calculator.division(4, 4);
        assertNotNull(result);
    }
}
