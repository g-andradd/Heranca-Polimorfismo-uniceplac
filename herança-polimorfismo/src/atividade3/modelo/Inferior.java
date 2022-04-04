package atividade3.modelo;

public class Inferior extends Camarote{

    public Inferior(double valor, Local localizacao) {
        super(valor, localizacao);
        acessarLocalizacao();
    }

    @Override
    public void imprimeValor() {
        System.out.println(super.getValor());
    }

    public void acessarLocalizacao(){
        System.out.println("Seu ingresso permite entrar no Camarote Inferior");
    }

    public void imprimeLocalizacao(){
        System.out.println(super.getLocalizacao());
    }

}
