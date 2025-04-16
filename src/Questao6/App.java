package Questao6;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {

        Gerente gerenteMaster = new Gerente("Daniel Lucio", 15000.00);
        Analista analistaSenior = new Analista("Lucas Almeida", 10000.00);

        ArrayList<Bonificavel> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(gerenteMaster);
        listaFuncionarios.add(analistaSenior);

        listaFuncionarios.sort(Comparator.comparingDouble(Bonificavel::calcularBonus).reversed());

        for (Bonificavel b : listaFuncionarios) {
            if (b instanceof Funcionario) {
                Funcionario f = (Funcionario) b;
                System.out.println(f.getNome() + " | Bônus: R$ " + String.format("%.2f", f.calcularBonus()));
            }
        }
    }
}
