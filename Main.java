import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando uma instância de Scanner
        Scanner scanner = new Scanner(System.in);

        //Printando os Operadores disponíveis
        System.out.println("Escolha um operador: ");
        System.out.println("[+] Soma");
        System.out.println("[-] Subtração");
        System.out.println("[*] Multiplicação");
        System.out.println("[/] Divisão");

        //Pegando o operador com o usuário
        System.out.print("> ");
        String operador = scanner.nextLine();

        System.out.println("Voce digitou: "+operador);
        

    }
}