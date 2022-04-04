package atividade3.modelo;

//Camarote é VIP
public abstract class Camarote extends VIP{

    public Local localizacao;

    //contrutor simples
    public Camarote(double valor, Local localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    //metodo abstrato
    public abstract void acessarLocalizacao();
}
