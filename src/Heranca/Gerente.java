package Heranca;

public class Gerente extends Funcionario{
    String departamento;

    public Gerente(String nome, Double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public Gerente(String nome, Double salario){
        super(nome, salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public Double calculaBonificacao(){
        return salario*0.12;
    }
}
