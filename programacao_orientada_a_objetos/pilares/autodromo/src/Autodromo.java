public class Autodromo {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.setChassi("12345");
        ferrari.ligar();

        Moto sahara = new Moto();
        sahara.setChassi("54321");
        sahara.ligar();

        Veiculo coringa = ferrari;
        coringa.ligar();

        Veiculo ccoringa = sahara;
        coringa.ligar();
    }
}
