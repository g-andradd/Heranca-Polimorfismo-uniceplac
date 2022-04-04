package atividade4.modelo;

public class Velho extends Imovel{

    private double precoVelho;
    private static double desconto = 30000;

    public Velho(String endereco, double preco) {
        super(endereco, preco);
        this.precoVelho = super.getPreco() - Velho.desconto;
    }

    public double getPrecoVelho() {
        return precoVelho;
    }

    public void setPrecoVelho(double precoVelho) {
        this.precoVelho = precoVelho;
    }

    public double getDesconto() {
        return Velho.desconto;
    }

    public void setDesconto(double desconto) {
        Velho.desconto = desconto;
    }
}
