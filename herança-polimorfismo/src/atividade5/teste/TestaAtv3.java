package atividade5.teste;

import atividade3.modelo.*;

import java.util.Scanner;

public class TestaAtv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String confirmar = "";
        int escolha = 0;

        Ingresso ingresso = new Ingresso(60);

        while (!confirmar.equals("s")) {
            System.out.println("Digite 1 - Ingresso normal");
            System.out.println("Digite 2 - Ingresso VIP");
            escolha = input.nextInt();

            System.out.println("Deseja confirmar? s/n");
            confirmar = input.next();
        }

        switch (escolha) {
            case 1:
                ingresso = new Normal(ingresso.getValor());
                ingresso.imprimeValor();
                break;

            case 2:
                do {
                    ingresso = new VIP(ingresso.getValor());
                    System.out.println("Digite 1 - Camarote Superior");
                    System.out.println("digite 2 - Camarote Inferior");
                    escolha = input.nextInt();

                    System.out.println("Deseja Confirmar? s/n");
                    confirmar = input.next();
                }while (!confirmar.equals("s"));
                switch (escolha){
                    case 1:
                        ingresso = new Superior(ingresso.getValor(), Local.CAMAROTE_SUPERIOR);
                        ingresso.imprimeValor();
                        break;
                    case 2:
                        ingresso = new Inferior(ingresso.getValor(), Local.CAMAROTE_INFERIOR);
                        ingresso.imprimeValor();
                        break;
                    default:
                        System.out.println("Valor inválido!");
                }
                break;
            default:
                System.out.println("valor inválido!");
        }
    }
}
