import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.print("Insira o número da sua conta: ");
        int numero = read.nextInt();
        System.out.print("Insira a sua agência: ");
        String agencia = read.next();
        System.out.print("Insira o seu nome: ");
        String nomeCliente = read.next();
        System.out.print("Qual é o depósito inicial?\n: ");
        double saldo = read.nextDouble();

        System.out.printf("%n%nOlá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f está disponível para saque.%n%n", nomeCliente, agencia, numero, saldo);
    }
}
