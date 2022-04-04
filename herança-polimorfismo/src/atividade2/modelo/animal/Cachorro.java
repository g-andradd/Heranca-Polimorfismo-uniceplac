package atividade2.modelo.animal;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String caminha() {
        return String.format("%s Caminhe!", super.getNome());
    }

    public String late(){
        return "Auf, Auf";
    }
}
