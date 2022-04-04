package atividade3.modelo;

public class Ingresso {

    private double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println(this.valor);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
