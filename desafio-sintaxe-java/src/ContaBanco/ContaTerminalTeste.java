package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalTeste {

    public static void main(String[] args) {
        
        ContaTerminal cliente1 = new ContaTerminal(); 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá futuro cliente! Seja bem-vindo ao nosso banco. \n"
                + "Para iniciarmos o processo de abertura de conta, vou precisar de alguns dados.");

        System.out.print("Qual é o seu nome?\n> "); 
        cliente1.nomeCliente = scanner.nextLine(); 
        
        System.out.print("\nQual a sua agência?\n> "); 
        cliente1.agenciaConta = scanner.nextLine(); 
        
        System.out.print("\nQual o número da sua conta?\n> "); 
        cliente1.numeroConta = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("\nQual o seu depósito inicial para essa conta?\n> "); 
        cliente1.saldoConta = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.printf("\nObrigado pelas informações, tudo pronto! Conta criada com sucesso! \n"
                + "Nome:    %s   \n"
                + "Agência: %s \n"
                + "Conta:   %d  \n"
                + "Saldo R$ %.2f \n", 
                cliente1.nomeCliente, cliente1.agenciaConta, cliente1.numeroConta, cliente1.saldoConta);
        
        scanner.close();
    }
}
