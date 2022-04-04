package atividade3.modelo;

//VIP é um ingresso
public class VIP extends Ingresso{

    private double valorAdicional = 50;

    //contrutor do vip
    public VIP(double valor) {
        super(valor);
        //diz que é um ingresso VIP
        System.out.println("Ingresso VIP");
        //acrescenta um valor no ingresso por ser mais caro
        super.setValor(super.getValor() + valorAdicional);
    }
}
