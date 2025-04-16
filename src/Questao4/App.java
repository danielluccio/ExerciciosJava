package Questao4;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteDaniel = new ContaCorrente("85 98620-2507", "Daniel Lucio", 2000.0);
        ContaPoupanca contaPoupancaDaniel = new ContaPoupanca("85 98620-2507", "Daniel Lucio", 4500.0);
        contaCorrenteDaniel.sacar(200);
        contaPoupancaDaniel.sacar(200);
    }
}
