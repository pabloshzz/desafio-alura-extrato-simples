import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Pablo Rafael Santos";
        String tipoConta = "Conta Corrente";
        double saldo = 4500.00;
        int opcao = 0;
        double saldoTransferido, saldoRecebido;

        System.out.println("******************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("******************************");

        while (opcao != 4) {
            System.out.println("\nOperações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nO saldo atual é R$ " + saldo);
                    break;

                case 2:
                    System.out.print("\nInforme o valor a receber: ");
                    saldoRecebido = sc.nextDouble();
                    saldo += saldoRecebido;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;

                case 3:
                    System.out.print("\nInforme o valor a transferir: ");
                    saldoTransferido = sc.nextDouble();
                    if (saldoTransferido > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saldoTransferido;
                        System.out.println("Saldo atualizado: R$ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }
        }

        sc.close();
    }
}
