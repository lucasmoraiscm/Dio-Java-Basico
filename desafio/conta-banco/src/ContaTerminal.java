import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque";
        System.out.println(mensagem);
    }
}
