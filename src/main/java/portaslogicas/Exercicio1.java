package portaslogicas;

import javax.swing.*;

public class Exercicio1 {

    public static void main(String[] args) {

        double renda;
        int idade;
        renda = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda mensal: "));
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

        if (renda >= 3000 && idade > 21) {
            JOptionPane.showMessageDialog(null, "Empréstimo aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo reprovado!");
        }

    }

}
