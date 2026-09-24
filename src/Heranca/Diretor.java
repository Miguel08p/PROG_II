package Heranca;

public class Diretor extends Funcionario{

    public Diretor(String nome, Double salario){
        super(nome, salario);
    }

    public Double calculaBonificacao(){
        return salario*0.15;
    }
}
