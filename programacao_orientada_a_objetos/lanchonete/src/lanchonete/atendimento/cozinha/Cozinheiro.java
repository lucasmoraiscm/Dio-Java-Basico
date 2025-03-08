package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche");
    }

    private void prepararVitamina() {
        System.out.println("Preparando suco");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Preparando pão, salada, carne e ovo");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Preparando fruta, leite e açúcar");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidificador");
    }

    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
