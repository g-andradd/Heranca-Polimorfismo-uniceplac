package atividade3.modelo;

public class Superior extends Camarote{

    private double ingressoSuperior;
    private double valorAdicional = 150;

    public Superior(double valor, Local localizacao) {
        super(valor, localizacao);
        acessarLocalizacao();
    }

    @Override
    public void imprimeValor() {
        System.out.println(ingressoCamaroteInferior());
    }

    public double ingressoCamaroteInferior(){
        this.ingressoSuperior = super.getValor() + valorAdicional;
        return ingressoSuperior;
    }

    @Override
    public void acessarLocalizacao() {
        System.out.println("Seu ingresso permite entrar no Camarote superior");
    }
}
