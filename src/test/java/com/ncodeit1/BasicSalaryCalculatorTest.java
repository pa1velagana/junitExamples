package com.ncodeit1;

import org.junit.Test;

public class BasicSalaryCalculatorTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetBasicSalaryNegative() {
        BasicSalaryCalculator calculator = new BasicSalaryCalculator();
        calculator.setBasicSalary(-1000.0);
    }
    
}
