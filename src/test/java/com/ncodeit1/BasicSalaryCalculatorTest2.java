package com.ncodeit1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BasicSalaryCalculatorTest2 {
  private BasicSalaryCalculator calculator;
 
  @Before
  public void setUp() {
    calculator = new BasicSalaryCalculator();
  }
 
  @Test
  public void testGetAdditionalBonus() {
    // set the basic salary to a positive value
    double salary = 50000.0;
    calculator.setBasicSalary(salary);
    
    // calculate the additional bonus and verify that it is correct
    double expectedBonus = salary / 10;
    double actualBonus = calculator.getAdditionalBonus();
    assertEquals(expectedBonus, actualBonus, 0.0);
  }
}
