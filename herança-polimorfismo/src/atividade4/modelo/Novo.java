package atividade4.modelo;

public class Novo extends Imovel{

    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
        super.setPreco(preco + adicional);
    }

    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
