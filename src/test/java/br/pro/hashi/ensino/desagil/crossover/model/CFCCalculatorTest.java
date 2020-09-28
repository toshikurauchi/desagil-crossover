package br.pro.hashi.ensino.desagil.crossover.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CFCCalculatorTest {
    @Test
    public void example() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(2.71, calculator.calculate(3, 4), 0.01);
    }
}
