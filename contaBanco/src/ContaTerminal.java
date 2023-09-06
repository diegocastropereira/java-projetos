import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        float saldo;
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Digite o número da sua conta: ");
            numero = input.nextInt();

            System.out.printf("Digite o número da sua agencia: ");
            agencia = input.next();

            System.out.printf("Digite seu nome: ");
            nomeCliente = input.next();

            System.out.printf("Digite seu saldo: ");
            saldo = input.nextFloat();
        }

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo de "+ saldo +" já está disponível para saque");
    }
}
