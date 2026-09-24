import java.util.Scanner;

public class Conta {

    Scanner sc = new Scanner(System.in);
    private String agencia;
    private String numero;
    private Cliente titular;
    private Double saldo = 0.0;

    public Conta(String agencia, String numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(){}

    public void sacar(Double valor){
        if (valor > this.saldo){
            throw new RuntimeException("Saldo insuficiente");
        }else if (valor < 0){
            throw new RuntimeException("Valor de saque negativo");
        }else{
            this.saldo -= valor;
        }
    }

    public void depositar(Double valor){
        if (valor > 0)
            this.saldo += valor;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNumero(){
        return this.numero;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void criaConta() {
        System.out.println("----Informe os dados da conta----");
        System.out.print("Nome do titular: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        Cliente cliente = new Cliente(nomeTitular, email);
        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Número: ");
        String numero = sc.nextLine();

        new Conta(agencia, numero, cliente);
    }
}
