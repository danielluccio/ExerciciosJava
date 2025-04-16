package Questao4;

public class ContaPoupanca extends Conta {

    ContaPoupanca(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(int valor) {
        double saldo = super.getSaldo();
        saldo -= (valor);
        System.out.println("O valor descontado foi: " + valor);

        System.out.println("Saldo atual: " + saldo);
    }
}
