package Modelo;

public class Ave implements Animal{
    private final String nome;
    
    public Ave(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void produzirSom() {
        System.out.println(nome + ":Cantar");
    }
    
    @Override
    public void mover(){
        System.out.print(nome + ": Voar");
    }    
}
