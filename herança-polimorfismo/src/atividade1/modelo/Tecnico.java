package atividade1.modelo;

public class Tecnico extends Assistente{

    private double bonificacao;

    public Tecnico(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario, matricula);
        this.bonificacao = super.getSalario() * 0.15;
        double novoSalario = super.getSalario() + this.bonificacao;
        super.setSalario(novoSalario);
        System.out.printf("Com um bônus de %.2f, o novo salário do %s é: %.2f\n"
                , this.bonificacao, super.getNome(), super.getSalario());
    }
}
