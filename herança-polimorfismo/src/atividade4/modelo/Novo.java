package atividade4.modelo;

public class Novo extends Imovel{

    private double precoNovo;
    private static double adicional = 50000;

    public Novo(String endereco, double preco) {
        super(endereco, preco);
        this.precoNovo = super.getPreco() + Novo.adicional;
    }

    public double getPrecoNovo() {
        return precoNovo;
    }

    public void setPrecoNovo(double precoNovo) {
        this.precoNovo = precoNovo;
    }

    public double getAdicional() {
        return Novo.adicional;
    }

    public void setAdicional(double adicional) {
        Novo.adicional = adicional;
    }
}
