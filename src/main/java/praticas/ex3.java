package praticas;

import javax.swing.*;

public class ex3 {

    public static void main(String[] args) {

        double precoPeca = Double.parseDouble(JOptionPane.showInputDialog("Valor da peça vendida: "));
        int quantidadeVendida = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças vendidas: "));

        double percentualComissao = 0.05;
        double comissaoFinal = precoPeca * percentualComissao * (quantidadeVendida);

        JOptionPane.showMessageDialog(null, "O valor de comissão dessa venda foi: " + comissaoFinal);

    }

}
