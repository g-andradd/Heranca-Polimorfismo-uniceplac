package atividade3.modelo;

public class Normal extends Ingresso{

    public Normal(double valor) {
        super(valor);
        System.out.println("Ingresso do tipo Normal.");
    }

    @Override
    public void imprimeValor() {
        System.out.println(super.getValor());
    }
}
