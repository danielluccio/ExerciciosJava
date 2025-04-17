package Questao7;

public class FaturaTeste {
    public static void main(String[] args) {

        Fatura faturaCliente1 = new Fatura("22222", "Monitor", 10, 2500.00);
        Fatura faturaCliente2 = new Fatura("33333", "Mouse", 8, 500.00);
        Fatura faturaCliente3 = new Fatura("44444", "Teclado", 8, 900.00);

        System.out.println(faturaCliente1.getTotalFatura());
        System.out.println(faturaCliente2.getTotalFatura());
        System.out.println(faturaCliente3.getTotalFatura());

    }

}
