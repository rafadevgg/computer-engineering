package poo.exemplo2;

import javax.swing.*;

public class PrincipalCalculadora {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão"));
        if (opcao < 1 || opcao > 4) {
            JOptionPane.showMessageDialog(null, "Opção incorreta!");
        }
        double v1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor? "));
        double v2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor? "));
        double resultado;

        if (opcao == 1) {
            resultado = c.soma(v1, v2);
        } else if (opcao == 2) {
            resultado = c.subtracao(v1, v2);
        } else if (opcao == 3) {
            resultado = c.multiplicacao(v1, v2);
        } else {
            resultado = c.divisao(v1, v2);
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

}
