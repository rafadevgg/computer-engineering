package praticas;

import javax.swing.*;

public class ex4 {

    public static void main(String[] args) {

        int numeroLeitura = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        Double.parseDouble(String.valueOf(numeroLeitura));
        numeroLeitura = (int) Math.nextDown(numeroLeitura);

        JOptionPane.showMessageDialog(null, "O número antecessor do digitado é " + numeroLeitura);

    }

}
