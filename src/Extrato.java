public class Extrato {
    public static void main(String[] args) {

        String data = String.format("%d/%d/%d", 13, 5, 2020);
        String origin = "456123789";
        String descricao = "saldo";
        Double valor = 1.01;
        Double saldo = 9.83;
        Double retiravel = 0.01;

        if (valor > 1) {
            String valor_2 = "ok";
            System.out.println(valor_2);
        } else {
            System.out.println("Menor que 1");
        }

    }
}
