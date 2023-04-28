package com.ncodeit1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class BasicSalaryCalculatorTest1 {

    @Test
    public void testSetBasicSalary() {
       
        BasicSalaryCalculator calculator = mock(BasicSalaryCalculator.class);


        double salary = 50000.0;
        calculator.setBasicSalary(salary);

          verify(calculator).setBasicSalary(salary);

 
        salary = -5000.0;
        try {
            calculator.setBasicSalary(salary);
        } catch (IllegalArgumentException e) {

            assertEquals("Negative salary is invalid.", e.getMessage());
        }
    }
}
