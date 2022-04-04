package atividade3.modelo;

public class VIP extends Ingresso{

    private double ingressoVip;
    private double valorAdicional = 50;

    public VIP(double valor) {
        super(valor);
        System.out.println("Ingresso VIP");
        super.setValor(super.getValor() + valorAdicional);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Novo valor do ingresso: " + IngressoVip());
    }

    public double IngressoVip(){
        this.ingressoVip = super.getValor();
        return ingressoVip;
    }

    public double getIngressoVip() {
        return ingressoVip;
    }

    public void setIngressoVip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
    }
}
