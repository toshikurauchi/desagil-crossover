package br.pro.hashi.ensino.desagil.crossover;

import br.pro.hashi.ensino.desagil.crossover.model.CCCCalculator;
import br.pro.hashi.ensino.desagil.crossover.model.CFCCalculator;
import br.pro.hashi.ensino.desagil.crossover.model.Calculator;
import br.pro.hashi.ensino.desagil.crossover.view.View;

import javax.swing.*;
import java.util.LinkedList;

public class Crossover {
    public static void main(String[] args) {

        // Constrói o modelo, que é simplesmente uma lista
        // de calculadoras. Aqui a coesão está boa: para
        // criar uma nova calculadora, basta criar a
        // respectiva classe e adicionar uma linha abaixo.
        LinkedList<Calculator> model = new LinkedList<>();
        model.add(new CCCCalculator());
        model.add(new CFCCalculator());

        // Constrói a visão, que também é um controlador.
        // Juntar visão e controlador prejudica a coesão,
        // mas decidir fazê-lo para simplificar o código.
        View view = new View(model);

        // Todas as linhas abaixo já foram explicadas nos Desafios.
        // Além disso, não é importante entendê-las para estas APS.
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setContentPane(view);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
