package atividade5.teste;

import atividade1.modelo.Administrativo;
import atividade1.modelo.Assistente;
import atividade1.modelo.Tecnico;
import atividade1.modelo.Turno;

public class TestaAtv1 {
    public static void main(String[] args) {
        Assistente administrativo = new Administrativo("Gabriel", "000.000.000-11", 1450.5, "029321", Turno.NOTURNO);
        Assistente tecnico = new Tecnico("João", "027.804.403-31", 2080.0, "029321");

        System.out.println(administrativo.getNome());
        System.out.println(administrativo.getSalario());

        System.out.println(tecnico.getNome());
        System.out.println(tecnico.getSalario());

    }
}
