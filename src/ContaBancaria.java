import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaBancaria {
    public static void  main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        double saldo = 0;

        System.out.print("Nome do titular da conta: ");
        String titularConta = entrada.nextLine();
        System.out.print("Entre com o tipo da conta: ");
        String tipoConta = entrada.nextLine();

        StringBuilder dadosConta = new StringBuilder();
        dadosConta.append("\n")
                        .append("Nome:" + titularConta)
                                .append("\nTipo da Conta:" + tipoConta);
        System.out.println(dadosConta.toString());
        System.out.println("---");
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("--------------\n");


        while(opcao != 4) {

            System.out.println("Operações ");
            System.out.println(" ");
            System.out.println("1 - Contultar saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo em conta: R$ " + saldo);
                System.out.println(" ");

            } else if (opcao == 2) {
                System.out.print("Digite o valor: ");
                double saldoEntrada = entrada.nextDouble();
                saldo = saldo + saldoEntrada;
                System.out.println(" ");

            } else if (opcao == 3) {

                System.out.print("Digite o valor a transferir: ");
                double valorTransf = entrada.nextDouble();

                if (valorTransf > saldo) {

                    System.out.println("Não é possivel transferir, pois o saldo não é suficiente!");
                }

            } else if (opcao == 4) {
                System.out.println("Finalizando o programa!");

            } else {
                System.out.println("Opção inválida!");
                System.out.println(" ");
            }
        }

    }

}