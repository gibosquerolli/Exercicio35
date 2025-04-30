package Principal;

import Modelo.Ave;
import Modelo.Cachorro;

public class Principal {
    public static void main(String[] args){
        Ave ave = new Ave("Papagaio");
        Cachorro cachorro = new Cachorro("Bob");

        ave.produzirSom();
        ave.mover();
        
        cachorro.produzirSom();
        cachorro.mover();
    }
}
