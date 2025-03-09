public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros estado: EstadosBrasileiros.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.PIAUI;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
