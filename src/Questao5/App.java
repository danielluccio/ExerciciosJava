package Questao5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Produto livro = new Produto("Livro", 17.90, 10);
        Produto caneta = new Produto("Caneta", 2.90, 40);
        Produto lapis = new Produto("Lapís", 3.50, 100);
        Produto apontador = new Produto("Apontador", 0.90, 200);
        Produto borracha = new Produto("Borracha", 1.00, 500);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(livro);
        listaProdutos.add(caneta);
        listaProdutos.add(lapis);
        listaProdutos.add(apontador);
        listaProdutos.add(borracha);

        System.out.println(listaProdutos.toString());

        livro.reajustarPreco(0.10);
        caneta.reajustarPreco(0.10);
        lapis.reajustarPreco(0.10);
        apontador.reajustarPreco(0.10);
        borracha.reajustarPreco(0.10);

        System.out.println("PREÇO ATUAL ATUAL");
        System.out.println(listaProdutos.toString());
    }
}
