import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe seu sobrenome: ");
        String sobreNomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + " " + sobreNomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
