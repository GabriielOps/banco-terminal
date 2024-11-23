import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome_cliente = scanner.next();

        System.out.println("Digite o numero da sua conta:");
        int num_conta = scanner.nextInt();

        System.out.println("Digite sua agencia");
        String agencia_conta = scanner.next();

        Double saldo = 10.0;

        System.err.println("Olá " + nome_cliente + ", obrigado por utilizar nosso banco, sua agência é " + agencia_conta + ", conta de numero" + num_conta + " e seu saldo é de " + saldo + " já está disponivel para operações.");

    }
}
