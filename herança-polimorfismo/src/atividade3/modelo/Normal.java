package atividade3.modelo;

//Normal é um ingresso
public class Normal extends Ingresso{

    //contrutor
    public Normal(double valor) {
        super(valor);
        //diz que aquele ingresso é do tipo normal
        System.out.println("Ingresso do tipo Normal.");
    }
}
