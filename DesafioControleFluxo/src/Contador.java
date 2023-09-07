import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número:");
            int valorUm = input.nextInt();
            System.out.println("Digite o segundo número:");
            int valorDois = input.nextInt();

            try {
                contar(valorUm, valorDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static void contar(int valorUm, int valorDois) throws ParametrosInvalidosException {
        int contagem = valorDois - valorUm;
        if (valorUm >= valorDois) {
            throw new ParametrosInvalidosException();
        }
        for (int i = 1; i <= contagem; i++) {
            System.out.println("O valor é " + i + ".");
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O valor dois é menor que o valor um.");
    }
}
