package poo.exemplo1;

public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Programação";
        livro.descricao = "Livro de programação orientada";
        livro.isbn = "9524785698";
        livro.preco = 45.95;
        livro.autor = "Erasmo Carlos";
        livro.dataPub = "20/04/2017";

        livro.dadosLivro();

    }

}
