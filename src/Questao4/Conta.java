package Questao4;

public abstract class Conta {
    Conta() {

    }

    private String numero;
    private String titular;
    private double saldo;

    Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(int valor) {
        if (valor < 0) {
            System.out.println("O valor depositado deve ser positivo !!!");
        }
        saldo += valor;
    }

    public abstract void sacar(int valor);

}
