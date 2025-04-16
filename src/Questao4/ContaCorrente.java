package Questao4;

public class ContaCorrente extends Conta {
    ContaCorrente(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(int valor) {
        int taxa = 5;
        double saldo = super.getSaldo();
        saldo -= (valor + taxa);
        System.out.println("Saldo atual: " + saldo);
    }

}
