package Heranca;

public class Funcionario {
    protected String nome;
    protected Double salario;


    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Double calculaBonificacao(){
        return salario*0.1;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double novoSalario){
        this.salario = novoSalario;
    }
}
