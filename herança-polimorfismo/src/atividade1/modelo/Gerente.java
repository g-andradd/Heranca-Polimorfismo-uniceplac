package atividade1.modelo;

//gerente é um funcionário
public class Gerente extends Funcionario{

    //contrutor
    public Gerente(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    //sobrescrita do método exibe dabos
    @Override
    public String exibeDados() {
        return String.format("Nome do funcionário: %s, CPF do funcionário: %s",
                super.getNome(), super.getCpf());
    }
}
