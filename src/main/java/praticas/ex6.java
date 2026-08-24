package praticas;

import javax.swing.*;

public class ex6 {

    public static void main(String[] args) {

        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Sua idade em anos: "));
        idadePessoa = idadePessoa * 365;

        JOptionPane.showMessageDialog(null, "Sua idade em dias é " + idadePessoa);

    }

}
