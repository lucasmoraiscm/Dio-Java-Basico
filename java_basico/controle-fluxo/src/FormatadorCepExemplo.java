public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formartarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
    }

    public static String formartarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        
        return "12.345-678";
    }
}
