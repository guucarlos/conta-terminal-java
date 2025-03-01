import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agencia! ");
        String agencia = sc.nextLine();

        System.out.println("Usuário: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s!, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d, e seu saldo R$ %.2f já esta disponivel para saque ",
        nomeCliente,agencia,numero, saldo);


    }
}
