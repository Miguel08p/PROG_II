package Heranca;
import java.util.Scanner;

public class Sistema {
    public Double totalBonificacao(Funcionario[] funcionarios){
        Double soma = 0.0;
        for(Funcionario funcionario : funcionarios) {
            soma += funcionario.calculaBonificacao();
        }
        return soma;
    }

    Double salarioMedio(Funcionario[] funcionarios){
        Double soma = 0.0;
        for(Funcionario funcionario : funcionarios) {
            soma += funcionario.salario;
        }
        return soma/funcionarios.length;
    }

    Double maiorSalario(Funcionario[] funcionarios){
        Double maior = Double.MIN_VALUE;
        for(Funcionario funcionario : funcionarios){
            if(funcionario.salario > maior){
                maior = funcionario.salario;
            }
        }
        return maior;
    }

    Double menorSalario(Funcionario[] funcionarios){
        Double menor = Double.MAX_VALUE;
        for(Funcionario funcionario : funcionarios){
            if(funcionario.salario < menor){
                menor = funcionario.salario;
            }
        }
        return menor;
    }




    public void main(String[] args) {
        int N;
        String nome;
        Double salario;
        int tipo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de funcionários: ");
        N = sc.nextInt();
        Funcionario[] funcionarios = new Funcionario[N];

        for (int i = 0; i<funcionarios.length; i++){
            System.out.print("Informe o nome do funcionário "+(i+1)+": ");
            nome = sc.next();
            System.out.print("Informe o salário do funcionário "+(i+1)+": ");
            salario = sc.nextDouble();
            System.out.print("Informe o tipo do funcionário "+(i+1)+": ");
            tipo = sc.nextInt();
            if (tipo == 1){
                funcionarios[i] = new Funcionario(nome, salario);
            } else if (tipo == 2) {
                funcionarios[i] = new Gerente(nome, salario);

            } else if (tipo == 3) {
                funcionarios[i]  = new Diretor(nome, salario);
            }
        }
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome);
            System.out.println("Salário: "+funcionario.salario);
            System.out.println("Bonoficação: "+funcionario.calculaBonificacao());
            System.out.println(" ");
        }

        maiorSalario(funcionarios);

        System.out.println("Total de bonificações: "+totalBonificacao(funcionarios));
        System.out.println("Salário médio: "+salarioMedio(funcionarios));
        System.out.println("Menor salário: "+menorSalario(funcionarios));
        System.out.println("Maior salário: "+maiorSalario(funcionarios));


    }
}
