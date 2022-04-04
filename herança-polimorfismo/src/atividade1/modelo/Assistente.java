package atividade1.modelo;

//Assistente é um Funcionário
public abstract class Assistente extends Funcionario{

    private String matricula;

    //método contrutor
    public Assistente(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario);
        this.matricula = matricula;
    }

    //sobrescrita do método exibeDados
    @Override
    public String exibeDados() {
        return String.format("Matrícula: %s, Nome: %s, CPF: %s",
                this.matricula, super.getNome(), super.getCpf());
    }
}
