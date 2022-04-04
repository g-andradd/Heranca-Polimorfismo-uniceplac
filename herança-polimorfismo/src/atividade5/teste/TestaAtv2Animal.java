package atividade5.teste;

import atividade2.modelo.animal.Cachorro;
import atividade2.modelo.animal.Gato;

public class TestaAtv2Animal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Sushi");
        System.out.println(cachorro.caminha());
        System.out.println(cachorro.late());

        Gato gato = new Gato("Mingau");
        System.out.println(gato.caminha());
        System.out.println(gato.mia());


    }
}
