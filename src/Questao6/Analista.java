package Questao6;

public class Analista extends Funcionario implements Bonificavel {

    Analista() {

    }

    Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }
}
