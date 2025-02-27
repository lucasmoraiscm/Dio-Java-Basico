public class Operadores {
    public static void main(String[] args) throws Exception {
        // Atribuição (=)
        String nome = "Lucas";
        int idade = 20;
        double altura = 1.81;

        // Aritméticos

        // Adição (+)
        int soma = 2 + 3;
        String nomeCompleto = "Lucas " + "Morais"; //concatenação

        // Subtração (-)
        int subtração = 10 - 4;

        // Multiplicação (*)
        int multiplicacao = 3 * 5;


        // Divisão (/)
        int divisao = 15 / 5;

        // Módulo (%)
        int modulo = 18 % 3;


        // Unário

        // Valor positivo (+)
        int positivo1 = 10;
        int positivo2 = +20;

        // Valor negativo (-)
        int negativo = -10;

        // Incremento (++)
        int numero = 1;
        numero++; //pós-incremento
        ++numero; //pré-incremento

        // Decremento (--)
        numero--; //pós-decremento
        ++numero; //pré-decremento

        // Negação (!)
        boolean variavel = true;
        variavel = !variavel; //false


        // Ternário
        char letra = 'A';
        boolean resultado1 = letra == 'A' ? true : false; //true
        System.out.println(resultado1);
        boolean resultado2 = letra == 'B' ? true : false; //false
        System.out.println(resultado2);


        // Relacionais
        int numero1 = 10;
        int numero2 = 100;

        // Igual (==)
        System.out.println(numero1 == numero2);
        
        // Diferente (!=)
        System.out.println(numero1 != numero2);
        
        // Maior que (>)
        System.out.println(numero1 > numero2);
        
        // Maior ou igual (>=)
        System.out.println(numero1 >= numero2);
        
        // Menor que (<)
        System.out.println(numero1 < numero2);
        
        // Menor ou igual (<=)
        System.out.println(numero1 <= numero2);
        

        // Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        // E (&&)
        System.out.println(condicao1 && condicao2);

        // OU (||)
        System.out.println(condicao1 || condicao2);
    }
}
