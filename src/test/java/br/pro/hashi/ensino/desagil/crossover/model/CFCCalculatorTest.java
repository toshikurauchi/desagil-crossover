package br.pro.hashi.ensino.desagil.crossover.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CFCCalculatorTest {
    /*
    @Test
    public void example() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(2.71, calculator.calculate(3, 4), 0.01);
    }
    */
    @Test
    public void aluminium() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(2.71, calculator.calculate(26.98, 0.143), 0.01);
    }

    @Test
    public void calcium() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(1.54, calculator.calculate(40.08, 0.197), 0.01);
    }

    @Test
    public void copper() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(8.89, calculator.calculate(63.55, 0.128), 0.01);
    }

    @Test
    public void gold() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(19.36, calculator.calculate(196.97, 0.144), 0.01);
    }

    @Test
    public void lead() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(11.35, calculator.calculate(207.2, 0.175), 0.01);
    }

    @Test
    public void nickel() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(8.82, calculator.calculate(58.69, 0.125), 0.01);
    }

    @Test
    public void platinum() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(21.32, calculator.calculate(195.08, 0.139), 0.01);
    }

    @Test
    public void silver() {
        CFCCalculator calculator = new CFCCalculator();
        Assertions.assertEquals(10.6, calculator.calculate(107.87, 0.144), 0.01);
    }
}
