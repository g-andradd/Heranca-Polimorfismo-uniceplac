package atividade1.modelo;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String exibeDados() {
        return String.format("Nome do funcionário: %s, CPF do funcionário: %s",
                super.getNome(), super.getCpf());
    }
}
