package com.musi.testspractice.interest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Factm
 */
public class SimpleInterestCalculatorTest {

    private  InterestCalculator interestCalculator;

    @Before
    public void init(){
        interestCalculator= new  SimpleInterestCalculator();
        interestCalculator.setRate(0.05);
    }

    @Test
    public void calculate() {
        double interest = interestCalculator.calculate(10000, 2);
        Assert.assertEquals(interest, 1000.0, 0);
    }
}
