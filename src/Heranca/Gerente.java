package Heranca;

public class Gerente extends Funcionario{
    String departamento;

    public Gerente(String nome, Double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Double calculaBonificacao(){
        return salario*15;
    }
}
