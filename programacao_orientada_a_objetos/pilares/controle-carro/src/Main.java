import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Carro carro = new Carro();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        int option;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> ligar();
                case 2 -> desligar();
                case 3 -> acelerar();
                case 4 -> desacelerar();
                case 5 -> virarEsquerda();
                case 6 -> virarDireita();
                case 7 -> verificarVelocidade();
                case 8 -> trocarMarcha();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (option != 0);
    }

    private static void ligar() {
        if (carro.ligar()) {
            System.out.println("O carro foi ligado");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    private static void desligar() {
        if (carro.desligar()) {
            System.out.println("O carro foi desligado");
        } else {
            System.out.println("O carro não pode ser desligado");
        }
    }

    private static void acelerar() {
        if (carro.acelerar()) {
            System.out.println("O carro foi acelerado");
        } else {
            System.out.println("O carro não pode ser acelerado");
        }
    }

    private static void desacelerar() {
        if (carro.desacelerar()) {
            System.out.println("O carro foi desacelerado");
        } else {
            System.out.println("O carro não pode ser desacelerado");
        }
    }

    private static void virarEsquerda() {
        if (carro.virarEsquerda()) {
            System.out.println("O carro virou a esquerda");
        } else {
            System.out.println("O carro não pode virar a esquerda");
        }
    }

    private static void virarDireita() {
        if (carro.virarDireita()) {
            System.out.println("O carro virou a direita");
        } else {
            System.out.println("O carro não pode virar a direita");
        }
    }

    private static void verificarVelocidade() {
        System.out.println("Velocidade atual: " + carro.verificarVelocidade() + " Km/h");
    }

    private static void trocarMarcha() {
        System.out.println("Digite a marcha: ");
        int marcha = scanner.nextInt();

        if (carro.trocarMarcha(marcha)) {
            System.out.println("A marcha foi trocada");
        } else {
            System.out.println("A marcha não pôde ser trocada");
        }
    }
}
