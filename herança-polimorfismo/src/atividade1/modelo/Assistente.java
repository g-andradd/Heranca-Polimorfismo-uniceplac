package atividade1.modelo;

public abstract class Assistente extends Funcionario{

    private String matricula;

    public Assistente(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf, salario);
        this.matricula = matricula;
    }

    @Override
    public String exibeDados() {
        return String.format("Matrícula: %s, Nome: %s, CPF: %s",
                this.matricula, super.getNome(), super.getCpf());
    }
}
