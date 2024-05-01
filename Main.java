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

        switch(operador) {
            //Caso soma
            case "+":
                System.out.print("Primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num2 = scanner.nextInt();

                int soma = num1 + num2;

                System.out.println("A soma é "+soma);
            break;
            //Caso subtração
            case "-":
                System.out.print("Primeiro número: ");
                int num3 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num4 = scanner.nextInt();

                int subtracao = num3 - num4;

                System.out.println("A subtração é "+subtracao);
            break;
            //Caso multiplicação
            case "*":
                System.out.print("Primeiro número: ");
                int num5 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num6 = scanner.nextInt();

                int multiplicacao = num5 * num6;

                System.out.println("A multiplicacão é "+multiplicacao);
            break;
            //Caso subtração
            case "/":
                System.out.print("Primeiro número: ");
                int num7 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num8 = scanner.nextInt();

                int divisao = num7 / num8;

                System.out.println("A divisão é "+divisao);
            break;
            //Se não for nenhum dos operadores disponíveis
            default:
                System.out.println("Operador não encontrado");
        }

        scanner.close();
    }
}