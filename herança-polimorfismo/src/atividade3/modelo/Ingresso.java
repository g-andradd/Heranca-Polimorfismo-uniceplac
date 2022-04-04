package atividade3.modelo;

public class Ingresso {

    private double valor;

    //contrutor
    public Ingresso(double valor){
        this.valor = valor;
    }

    //método para imprimir o valor
    public void imprimeValor(){
        System.out.println("Valor do ingresso: " + this.valor);
    }

    //método para acessar o valor do ingresso
    public double getValor() {
        return this.valor;
    }

    //método para dar um novo valor pro ingresso
    public void setValor(double valor) {
        this.valor = valor;
    }
}
