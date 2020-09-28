package br.pro.hashi.ensino.desagil.crossover.model;

public abstract class Calculator {
    // Constante do mol, ou seja, mol é essa constante vezes 10^23.
    protected final static double MOLC = 6.02214076;

    private final String name;

    protected Calculator(String name) {
        this.name = name;
    }

    // Esse toString é um método especial que o Java usa quando
    // precisa de uma representação textual do objeto. Por exemplo,
    // quando você passa o objeto para o System.out.println. Uma
    // implementação padrão existe, mas aqui estamos reescrevendo.
    @Override
    public String toString() {
        return name;
    }

    // O conceito de métodos abstratos está no Guia Opcional 1.
    // Um método abstrato é basicamente um método que deve existir
    // em todas as subclasses, mas não tem uma implementação padrão.
    // Portanto, não faz sentido ter "recheio" aqui na superclasse.
    public abstract double calculate(double weight, double radius);
}
