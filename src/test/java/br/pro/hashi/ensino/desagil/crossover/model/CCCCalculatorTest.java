package br.pro.hashi.ensino.desagil.crossover.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CCCCalculatorTest {
    /*
    @Test
    public void example() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(3.14, calculator.calculate(3, 4), 0.01);
    }
    */
    @Test
    public void barium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(3.62, calculator.calculate(137.33, 0.217), 0.01);
    }

    @Test
    public void cesium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(1.92, calculator.calculate(132.91, 0.265), 0.01);
    }

    @Test
    public void chromium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(7.18, calculator.calculate(52, 0.125), 0.01);
    }

    @Test
    public void iron() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(7.9, calculator.calculate(55.85, 0.124), 0.01);
    }

    @Test
    public void lithium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(0.53, calculator.calculate(6.94, 0.152), 0.01);
    }

    @Test
    public void molybdenum() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(10.28, calculator.calculate(95.94, 0.136), 0.01);
    }

    @Test
    public void niobium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(8.56, calculator.calculate(92.91, 0.143), 0.01);
    }

    @Test
    public void potassium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(0.85, calculator.calculate(39.1, 0.231), 0.01);
    }

    @Test
    public void sodium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(0.96, calculator.calculate(22.99, 0.186), 0.01);
    }

    @Test
    public void tungsten() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(19.27, calculator.calculate(183.84, 0.137), 0.01);
    }

    @Test
    public void vanadium() {
        CCCCalculator calculator = new CCCCalculator();
        Assertions.assertEquals(5.97, calculator.calculate(50.94, 0.132), 0.01);
    }
}
