package Questao7;

public class Fatura {

    Fatura() {
        // Construtor Padrão
    }

    private String numero;
    private String descricao;
    private int qtdComprada;
    private double precoItem;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    Fatura(String numero, String descricao, int qtdComprada, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.precoItem = precoItem;
    }

    public double getTotalFatura() {
        if (getQtdComprada() == 0 || getPrecoItem() == 0.0) {
            System.out.println("Valor não positivo !!!");
            return 0;
        }

        return getQtdComprada() * getPrecoItem();
    }

}
