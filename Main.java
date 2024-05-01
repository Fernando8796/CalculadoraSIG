import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando uma instância de Scanner
        Scanner scanner = new Scanner(System.in);

        //Printando os Operadores disponíveis
        System.out.println("Escolha um operador: ");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[5] Potênciação");
        System.out.println("[6] Radiciação");

        //Pegando o operador com o usuário
        System.out.print("> ");
        String operador = scanner.nextLine();

        switch(operador) {
            //Caso soma
            case "1":
                System.out.print("Primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num2 = scanner.nextInt();

                int soma = num1 + num2;

                System.out.println("A soma é "+soma);
            break;
            //Caso subtração
            case "2":
                System.out.print("Primeiro número: ");
                int num3 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num4 = scanner.nextInt();

                int subtracao = num3 - num4;

                System.out.println("A subtração é "+subtracao);
            break;
            //Caso multiplicação
            case "3":
                System.out.print("Primeiro número: ");
                int num5 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num6 = scanner.nextInt();

                int multiplicacao = num5 * num6;

                System.out.println("A multiplicacão é "+multiplicacao);
            break;
            //Caso subtração
            case "4":
                System.out.print("Primeiro número: ");
                int num7 = scanner.nextInt();

                System.out.print("Segundo número: ");
                int num8 = scanner.nextInt();

                int divisao = num7 / num8;

                System.out.println("A divisão é "+divisao);
            break;
            //Caso potenciação
            case "5":
                System.out.print("Base: ");
                int base = scanner.nextInt();

                System.out.print("Expoente: ");
                int exp = scanner.nextInt();

                double potencia = Math.pow(base, exp);

                System.out.println("A potência é: "+potencia);
            break;
            //Caso radiciação
            case "6":
                System.out.print("Radicando: ");
                int radicando = scanner.nextInt();

                System.out.print("Índice: ");
                double indice = (1 / scanner.nextDouble());

                double radiciacao = Math.pow(radicando, indice);

                System.out.println("A radiciação é: "+radiciacao);
            break;
            //Se não for nenhum dos operadores disponíveis
            default:
                System.out.println("Operador não encontrado");
        }

        scanner.close();
    }
}