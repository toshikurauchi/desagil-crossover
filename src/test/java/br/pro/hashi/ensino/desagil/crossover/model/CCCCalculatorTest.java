package br.pro.hashi.ensino.desagil.crossover.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CCCCalculatorTest {
    @Test
    public void example() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(3.14, calculator.calculate(3, 4), 0.01);
    }
}
