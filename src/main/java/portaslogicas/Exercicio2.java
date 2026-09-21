package portaslogicas;

import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {
        String isEstudante = JOptionPane.showInputDialog("É estudante? (Sim/Não)");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

        if (isEstudante.equalsIgnoreCase("sim") || idade > 60) {
            JOptionPane.showMessageDialog(null, "Ganhou meia-entrada!");
        } else {
            JOptionPane.showMessageDialog(null, "Não ganhou meia-entrada!");
        }
    }

}
