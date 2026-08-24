package praticas;

import javax.swing.*;

public class ex5 {

    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Base do retângulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do retângulo: "));
        double areaFinal = base * altura;

        JOptionPane.showMessageDialog(null, "A área do retângulo é " + areaFinal);

    }

}
