/**
* <h1>Conta Terminal/h1>
* Este programa simula uma criação de conta via terminal
* <p>
* <b>Note:</b> Leia atentamente a documentação da classe
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  YuriQuest (Yuri M. dos Santos rodrigues)
* @version 1.0
* @since   14/05/2024
*/
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /*Este método é utilizado para simular a criação de conta via terminal*/
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de sua Conta");
        int NumeroConta         =  scanner.nextInt();
        
        System.out.println("Digite o numero de sua agencia.");
        String NumeroAgencia    = scanner.next();

        System.out.println("Digite o seu Nome");
        String NomeCliente      = scanner.next();

        System.out.println("Agora digite seu Sobrenome");
        String SobrenomeCliente = scanner.next();

        System.out.println("Digite seu o seu saldo");
        double Saldo            = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + " " + SobrenomeCliente + ", obrigado por criar uma conta em nosso banco, o numero de sua agência é " + NumeroAgencia + ", conta " + NumeroConta + " com o saldo de "+ Saldo + " já disponível para saques.");
    }
}
