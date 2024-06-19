import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner para entrada de dados

        // Declaração de variáveis
        int numeroConta;
        String agenciaConta, nomeCliente;
        double saldoConta;

        // Solicitação e coleta de dados da conta
        System.out.println("**Criação de Conta Bancária**");
        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = entrada.nextInt();
        entrada.nextLine(); // Consumir quebra de linha

        System.out.print("Por favor, digite o número da agência: ");
        agenciaConta = entrada.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldoConta = entrada.nextDouble();
        entrada.nextLine(); // Consumir quebra de linha

        // Formatação da mensagem final
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " +
                saldoConta + " já está disponível para saque.";

        // Exibição da mensagem final
        System.out.println("\n" + mensagemFinal);

        entrada.close(); // Fechar o Scanner
    }
}
