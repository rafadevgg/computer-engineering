package praticas;

import javax.swing.*;

public class ex1 {

    public static void main(String[] args) {

        double cotacaoDolar = 5.16;
        double valorParaCotar = Double.parseDouble(JOptionPane.showInputDialog("Digite os seus dólares: "));
        double cotacaoEmReal = valorParaCotar * cotacaoDolar;

        JOptionPane.showMessageDialog(null, "O valor cotado em reais (R$) é " + cotacaoEmReal);

    }

}
