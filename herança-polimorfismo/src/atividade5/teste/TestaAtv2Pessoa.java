package atividade5.teste;

import atividade2.modelo.pessoa.Miseravel;
import atividade2.modelo.pessoa.Pobre;
import atividade2.modelo.pessoa.Rica;

public class TestaAtv2Pessoa {
    public static void main(String[] args) {
        Rica rica = new Rica();
        rica.fazCompras();

        Pobre pobre = new Pobre();
        pobre.trabalha();

        Miseravel miseravel = new Miseravel();
        miseravel.mendiga();
    }
}
