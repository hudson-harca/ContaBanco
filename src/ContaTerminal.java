import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite o código da Agência com o dígito (XXX-X): ");
		String agencia = sc.nextLine();
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite seu nome completo: ");
		sc.nextLine();
		String cliente = sc.nextLine();
		System.out.print("Digite o valor do depósito inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " 
				+ agencia + ", conta " + numero + " e seu saldo de R$ " + saldo 
				+ " já está disponivel para saque");
		
		sc.close();
		
		//TODO: Conhecer e importar a classe Scanner - FEITO
		//Exibir as mensagens para o usuário - FEITO
		//Obter pelo scanner os valores digitados no terminal - FEITO
		//Exibir a mensagem conta criada - FEITO
		
	}

}
