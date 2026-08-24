package praticas;

import javax.swing.*;

public class ex2 {

    public static void main(String[] args) {

        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2: "));
        double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Valor 3: "));
        double valor4 = Double.parseDouble(JOptionPane.showInputDialog("Valor 4: "));

        valor1 = Math.pow(valor1, 2);
        valor2 = Math.pow(valor2, 2);
        valor3 = Math.pow(valor3, 2);
        valor4 = Math.pow(valor4, 2);

        double resultadoFinal = valor1 + valor2 + valor3 + valor4;
        JOptionPane.showMessageDialog(null, "A soma dos números ao quadrado é " + resultadoFinal);

    }

}
