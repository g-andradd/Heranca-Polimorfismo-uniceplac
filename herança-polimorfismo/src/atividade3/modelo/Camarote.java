package atividade3.modelo;

public abstract class Camarote extends VIP{

    public Local localizacao;

    public Camarote(double valor, Local localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    public abstract void acessarLocalizacao();

    public Local getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Local localizacao) {
        this.localizacao = localizacao;
    }
}
