package br.pro.hashi.ensino.desagil.crossover.model;

public class CFCCalculator extends Calculator {
    public CFCCalculator() {
        super("CFC");
    }

    @Override
    public double calculate(double weight, double radius) {
        double w = 4 * weight;
        double v = Math.pow(4 * radius / Math.sqrt(2), 3);
        return (w / v) / (6.02214076 * 100);
    }
}
