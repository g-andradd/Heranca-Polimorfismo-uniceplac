package atividade1.modelo;

public class Administrativo extends Assistente{

    private Turno turno;
    private double bonificacao;

    public Administrativo(String nome, String cpf, double salario, String matricula, Turno turno) {
        super(nome, cpf, salario, matricula);
        this.turno = turno;
        if(this.turno.equals(Turno.NOTURNO)){
            double salarioComAdicional;
            this.bonificacao = super.getSalario() * 0.2;
            salarioComAdicional = super.getSalario() + this.bonificacao;
            super.setSalario(salarioComAdicional);
            System.out.printf("Com um adicional de %.2f, o novo salário do %s é: %.2f\n",
                    this.bonificacao, super.getNome(), salarioComAdicional);
        }
    }
}
