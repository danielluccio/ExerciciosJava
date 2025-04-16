package Questao6;

public class Gerente extends Funcionario implements Bonificavel {

    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }

}
