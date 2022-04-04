package atividade1.modelo;

//Administrativo é um Assistente
public class Administrativo extends Assistente{

    private Turno turno;
    private double bonificacao;

    //contrutor que chama o método que da acrescimo para quem trabalha no período noturno
    public Administrativo(String nome, String cpf, double salario, String matricula, Turno turno) {
        super(nome, cpf, salario, matricula);
        this.turno = turno;
        darAcrescimoParaNoturno();
    }

    //método que da um acrescimo de 20% ao assistente administrativo que trabalha no periodo Noturno
    public void darAcrescimoParaNoturno(){
        if(this.turno.equals(Turno.NOTURNO)){
            double salarioComAdicional;
            this.bonificacao = super.getSalario() * 0.2;
            salarioComAdicional = super.getSalario() + this.bonificacao;
            super.setSalario(salarioComAdicional);
            System.out.printf("Com um adicional de %.2fR$, o novo salário do %s é: %.2fR$%n",
                    this.bonificacao, super.getNome(), salarioComAdicional);
        }
    }
}
