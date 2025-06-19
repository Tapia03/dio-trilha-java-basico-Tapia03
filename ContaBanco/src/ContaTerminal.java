import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        var nomeCliente = "Mario de Andrade";
        double saldo = 237.48;
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");


        scanner.close();
    }
}
