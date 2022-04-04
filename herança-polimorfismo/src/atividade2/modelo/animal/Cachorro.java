package atividade2.modelo.animal;

//Cachorro é um animal
public class Cachorro extends Animal{

    //contrutor
    public Cachorro(String nome) {
        super(nome);
    }

    //sobrscrita do método caminhar
    @Override
    public String caminha() {
        return String.format("%s Caminhe!", super.getNome());
    }

    //metodo para o cachorro latir
    public String late(){
        return "Auf, Auf";
    }
}
