package atividade1.modelo;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //contrutor
    Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //metodo abstrato para exibir os dados
    public abstract String exibeDados();

    //métodos get e set
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
