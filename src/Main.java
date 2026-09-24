import java.util.Scanner;

void main() {
    Conta contaSelecionada = new Conta();
    Scanner sc = new Scanner(System.in);
    ArrayList<Conta> contas = new ArrayList<>();

    Conta conta1 = new Conta();
    conta1.criaConta();

    Conta conta2 = new Conta();
    conta2.criaConta();

    contas.add(conta1);
    contas.add(conta2);

    System.out.print("Informe a agência: ");
    String agencia = sc.next();

    System.out.print("Informe o número da conta: ");
    String numero = sc.next();

    for(Conta conta : contas){
        String agencia1 = conta.getAgencia();
        String numero1 = conta.getNumero();

        if(agencia1.equals(agencia) && numero1.equals(numero)){
            contaSelecionada = conta;
        }
    }

    Cliente clienteSelecionado = contaSelecionada.getTitular();
    System.out.println("Informe o valor que quer depositar: ");
    Double deposito = sc.nextDouble();
    contaSelecionada.depositar(deposito);

    System.out.println("Informe o valor que quer sacar: ");
    Double saque = sc.nextDouble();
    contaSelecionada.sacar(saque);

    System.out.println("Saldo final: "+contaSelecionada.getSaldo());
    System.out.println("Titular da conta: "+ clienteSelecionado.getNome());
    System.out.println("Email titular: "+clienteSelecionado.getEmail());
}

//Nada de anormal ocorreria. Seria com os mesmos atributos e métodos já criados. Seria do mesmo jeito.
