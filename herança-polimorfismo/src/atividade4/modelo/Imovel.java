package atividade4.modelo;

public class Imovel {

    //atributos do imovel
    private String endereco;
    private double preco;

    //contrutor simples
    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    //metodos get e set do imovel
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
