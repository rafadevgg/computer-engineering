package praticas;

import javax.swing.*;

public class SwitchCase {

    public static void main(String[] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));

        switch (nota) {
            case 10:
                JOptionPane.showMessageDialog(null, "Parabéns!");
                JOptionPane.showMessageDialog(null, "Conceito A");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito C");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Conceito D");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Reprovado!");
                break;
        }

    }

}
