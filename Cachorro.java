package Modelo;

public class Cachorro implements Animal {
    private String nome;
    
    public Cachorro(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void produzirSom() {
        System.out.println(nome + ": Latir");
    }
    
    @Override
    public void mover () {
        System.out.println(nome = ": Andar");
    }
}
