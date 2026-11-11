package poo.exemplo1;

import javax.swing.*;

public class Livro {

    String nome;
    String descricao;
    String autor;
    String isbn;
    double preco;
    String dataPub;

    void dadosLivro() {
        JOptionPane.showMessageDialog(null, "Nome do Livro " + nome);
        JOptionPane.showMessageDialog(null, "Descrição " + descricao);
        JOptionPane.showMessageDialog(null, "Preço " + preco);
        JOptionPane.showMessageDialog(null, "Autor " + autor);
        JOptionPane.showMessageDialog(null, "Data Publicação " + dataPub);
    }

}
