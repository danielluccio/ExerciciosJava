package Questao8;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Daniel", "Lucio de Castro", 3500.00);
        Empregado empregado2 = new Empregado("Guilherme", "Sousa", 4500.00);
        Empregado empregado3 = new Empregado("Igor", "Pimentel", 7500.00);

        System.out.format("Empregado %s %s\nSalário Mensal: %.2f\n", empregado1.getNome(), empregado1.getSobrenome(),
                empregado1.getSalarioMensal());
        System.out.format("Empregado %s %s\nSalário Mensal: %.2f\n", empregado2.getNome(), empregado2.getSobrenome(),
                empregado2.getSalarioMensal());
        System.out.format("Empregado %s %s\nSalário Mensal: %.2f\n", empregado3.getNome(), empregado3.getSobrenome(),
                empregado3.getSalarioMensal());

        System.out.println("_--------------------------------------------------------_");

        System.out.format("Empregado %s %s\nSalário Mensal: %.2f\n", empregado1.getNome(), empregado1.getSobrenome(),
                empregado1.getSalarioMensal() + empregado1.getSalarioMensal() * 0.10);
        System.out.format("Empregado %s %s\nSalário Mensal: %.2f\n", empregado2.getNome(), empregado2.getSobrenome(),
                empregado2.getSalarioMensal() + empregado2.getSalarioMensal() * 0.10);
        System.out.format("Empregado %s %s\nSalário Mensal: %.2f\n", empregado3.getNome(), empregado3.getSobrenome(),
                empregado3.getSalarioMensal() + empregado3.getSalarioMensal() * 0.10);
    }
}
