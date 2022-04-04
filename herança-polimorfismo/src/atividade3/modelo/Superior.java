package atividade3.modelo;

//superior é um contrutor
public class Superior extends Camarote{

    private double valorAdicional = 150;

    //contrutor que chama o método acessar Localização e acrescenta um valor no ingresso
    public Superior(double valor, Local localizacao) {
        super(valor, localizacao);
        acessarLocalizacao();
        super.setValor(super.getValor() + this.valorAdicional);
    }

    //sobrescrita do método acessar localização
    @Override
    public void acessarLocalizacao() {
        System.out.println("Seu ingresso permite entrar no Camarote superior");
    }
}
