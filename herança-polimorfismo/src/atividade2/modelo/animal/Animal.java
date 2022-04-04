package atividade2.modelo.animal;

public abstract class Animal {

    private String nome;
    private String raca;

    //contrutor vazio
    public Animal(){}

    //contrutor passando o nome do animal
    public Animal(String nome){
        this.nome = nome;
    }

    public abstract String caminha();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
