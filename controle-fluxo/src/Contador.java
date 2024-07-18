/**
* <h1>Conta Terminal/h1>
* Este programa simula uma criação de conta via terminal
* <p>
* <b>Note:</b> Leia atentamente a documentação da classe
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  YuriQuest (Yuri M. dos Santos rodrigues)
* @version 1.0
* @since   15/05/2024
*/
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		} finally {
			terminal.close();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
            System.out.println("Número: " + i);
        }
	}
}