package atividade3.modelo;


//Inferior é um Camarote
public class Inferior extends Camarote{

    //Contrutor que chama o método acessar localização
    public Inferior(double valor, Local localizacao) {
        super(valor, localizacao);
        acessarLocalizacao();
    }

    //sobrescrita do método para acessar a localização
    @Override
    public void acessarLocalizacao() {
        System.out.println("Seu ingresso permite entrar no Camarote Inferior");
    }

}
