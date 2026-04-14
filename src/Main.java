import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        int opcao;

        do {
            System.out.println("\n=== BANCO ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                conta.verSaldo();

            } else if (opcao == 2) {
                System.out.print("Valor para depositar: ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);

            } else if (opcao == 3) {
                System.out.print("Valor para sacar: ");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
    }
}