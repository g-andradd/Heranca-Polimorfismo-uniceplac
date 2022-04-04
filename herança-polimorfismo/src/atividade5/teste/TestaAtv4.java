package atividade5.teste;

import atividade4.modelo.Imovel;
import atividade4.modelo.Novo;
import atividade4.modelo.Velho;

import java.util.Scanner;

public class TestaAtv4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Imovel imovel = new Imovel("306 asa sul", 300000);

        int escolha = 0;
        String confirma = "";

        System.out.printf("Endereço do imóvel: %s, preço médio do imóvel: %.2fR$%n", imovel.getEndereco(), imovel.getPreco());

        while (!confirma.equals("s")){
            System.out.println("Digite 1 - Imovel novo");
            System.out.println("Digite 2 - Imovel velho");
            escolha = input.nextInt();

            System.out.println("Deseja confirmar? s/n");
            confirma = input.next();
        }

        switch (escolha){
            case 1:
                System.out.println("Você escolheu um imóvel no endereço " + imovel.getEndereco());
                Novo novo = new Novo(imovel.getEndereco(), imovel.getPreco());
                System.out.printf("O preço de um imóvel novo nesse endereço é: %.2fR$", novo.getPrecoNovo());
                break;
            case 2:
                System.out.println("Você escolheu um imóvel velho no endereço " + imovel.getEndereco());
                Velho velho = new Velho(imovel.getEndereco(), imovel.getPreco());
                System.out.printf("O preço de um imóvel velho nesse endereço é: %.2fR$", velho.getPrecoVelho());
                break;
            default:
                System.out.println("Valor inválido!");
        }
    }
}
