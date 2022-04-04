package atividade2.modelo.animal;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String caminha() {
        return String.format("%s Caminhe!", super.getNome());
    }

    public String mia(){
        return "Miau, Miau";
    }
}
