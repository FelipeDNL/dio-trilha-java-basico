import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nome = input.nextLine();

        System.out.println("Por favor, digite o saldo desejado:");
        double saldo = Double.parseDouble(input.nextLine());

        System.out.println("\"Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque\".");
    }
}
