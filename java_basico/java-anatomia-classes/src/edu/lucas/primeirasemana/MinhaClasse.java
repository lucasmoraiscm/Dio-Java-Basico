package edu.lucas.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Morais";
        int idade = 20;
        double altura = 1.81;
        boolean verdadeira = true;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeironome, String segundoNome) {
        return "Nome completo: " + primeironome.concat(" ").concat(segundoNome);
    }
}
