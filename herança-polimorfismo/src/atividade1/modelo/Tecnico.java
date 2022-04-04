package atividade1.modelo;

//tecnico é um assistente
public class Tecnico extends Assistente{

    private double bonificacao;

    //construtor
    public Tecnico(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario, matricula);
        //Coloca no salario do assistente uma bonificação de 15%
        super.setSalario(salarioComBonus());
        System.out.printf("Com um bônus de %.2fR$, o novo salário do %s é: %.2fR$%n"
                , this.bonificacao, super.getNome(), super.getSalario());
    }

    //Método que da 15% de bonus do salário
    public double salarioComBonus(){
        this.bonificacao = super.getSalario() * 0.15;
        double novoSalario = super.getSalario() + this.bonificacao;
        return novoSalario;
    }

}
