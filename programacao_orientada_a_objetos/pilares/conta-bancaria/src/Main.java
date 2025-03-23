import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private static Conta conta;

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        int option;

        System.out.println("=== Criar conta ===");

        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.next();

        System.out.println("Digite o saldo da conta:");
        Double saldoConta = scanner.nextDouble();

        conta = new Conta(numeroConta, saldoConta);

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> consultarSaldo();
                case 2 -> consultarChequeEspecial();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> pagarBoleto();
                case 6 -> verificarUsoChequeEspecial();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (option != 0);
    }

    private static void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }

    private static void consultarChequeEspecial() {
        System.out.println("Cheque especial total: R$ " + conta.getValorChequeEspecialTotal());
        System.out.println("Cheque especial disponível: R$ " + conta.getChequeEspecialDisponivel());
    }

    private static void depositar() {
        System.out.println("Digite o valor desejado:");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso");
    }

    private static void sacar() {
        System.out.println("Digite o valor desejado:");
        double valor = scanner.nextDouble();

        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo indisponível");
        }
    }

    private static void pagarBoleto() {
        System.out.println("Digite o valor do boleto:");
        double valor = scanner.nextDouble();

        if (conta.pagarBoleto(valor)) {
            System.out.println("Boleto pago com sucesso");
        } else {
            System.out.println("Saldo indisponível");
        }
    }

    private static void verificarUsoChequeEspecial() {
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("O cheque está sendo usado");
        } else {
            System.out.println("O cheque não está sendo usado");
        }
    }
}
