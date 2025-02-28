/**
* <h1>SmartTv<h1/>
* A SmartTV realiza operações de ligar/desligar, aumentar/diminuir volume, aumentar/diminuir canal e mudar canal
* <p>
* <b>Note:<b/> Leia atentamente a documentação desta classe para disfrutar dos recursos oferecidos pelo autor
* 
* @autor Lucas Morais
* @version 1.0
* @since 27/02/2025
*/

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    /**
    * Este método é utiizado para alterar o canal
    * @param novoCanal o canal para qual a SmartTV irá mudar
    */

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    /* javadoc
    * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
    */

}
