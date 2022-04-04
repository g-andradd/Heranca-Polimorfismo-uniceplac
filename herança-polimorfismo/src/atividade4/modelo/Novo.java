package atividade4.modelo;

//Novo é um imovel
public class Novo extends Imovel{

    //atributos do Imovel novo
    private double precoNovo;
    private static double adicional = 50000;

    //contrutor que da um preço adicional ao imovel por ser novo
    public Novo(String endereco, double preco) {
        super(endereco, preco);
        this.precoNovo = super.getPreco() + Novo.adicional;
    }

    //metodos get e set do imovel novo
    public double getPrecoNovo() {
        return precoNovo;
    }

    public void setPrecoNovo(double precoNovo) {
        this.precoNovo = precoNovo;
    }

    public double getAdicional() {
        return Novo.adicional;
    }

    public static void setAdicional(double adicional) {
        Novo.adicional = adicional;
    }
}
