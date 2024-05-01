import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número da sua conta ?");
        int conta = leitura.nextInt();

        System.out.println("Digite sua agência bancaria ?");
        int agencia = leitura.nextInt();

        System.out.println("Digite seu nome completo ?");
        String nomeCompleto = leitura.next();

        System.out.println("Digite seu saldo ?");
        double saldo = leitura.nextDouble();

        System.out.println(
                String.format(
                        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %2.f já está disponível para saque",
                        nomeCompleto, agencia, conta, saldo));
    }
}
