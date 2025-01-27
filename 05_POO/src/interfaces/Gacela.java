package interfaces;

import javax.annotation.processing.SupportedOptions;

public class Gacela extends Animal implements Presa {

    public Gacela(){

    }

    @Override
    public void huir() {
        System.out.println("¡Corre gacela, corre!");
    }

}
