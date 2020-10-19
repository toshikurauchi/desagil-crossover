package br.pro.hashi.ensino.desagil.crossover.model;

public class CCCCalculator extends Calculator {
    public CCCCalculator() {
        super("CCC");
    }

    @Override
    public double calculate(double weight, double radius) {
        double w = 2 * weight;
        double v = Math.pow(4 * radius / Math.sqrt(3), 3);
        return (w / v) / (6.02214076 * 100);
    }
}
