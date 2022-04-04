package atividade2.modelo.animal;

//Gato é um animal
public class Gato extends Animal{

    //construtor
    public Gato(String nome) {
        super(nome);
    }

    //Sobrescrita do método caminhar
    @Override
    public String caminha() {
        return String.format("%s Caminhe!", super.getNome());
    }

    //método para o gato miar
    public String mia(){
        return "Miau, Miau";
    }
}
