package fundamentos;

import javax.swing.*;

public class TesteComSwing {

    public static void main(String[] args) {

        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: "));
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));

        int resultado = primeiroValor + segundoValor;
        JOptionPane.showMessageDialog(null, "Resultado final " + resultado, "RESULTADO", JOptionPane.WARNING_MESSAGE);

    }

}
