package atividade4.modelo;

//velho é um imovel
public class Velho extends Imovel{

    //atributos do imovel velho
    private double precoVelho;
    private static double desconto = 30000;

    //metodo que desconta um valor no preço do imovel por ser velho
    public Velho(String endereco, double preco) {
        super(endereco, preco);
        this.precoVelho = super.getPreco() - Velho.desconto;
    }

    //métodos get e set do imovel velho
    public double getPrecoVelho() {return precoVelho;}

    public void setPrecoVelho(double precoVelho) {this.precoVelho = precoVelho;}

    public double getDesconto() {
        return Velho.desconto;
    }

    public static void setDesconto(double desconto) {
        Velho.desconto = desconto;
    }
}
