import java.util.Scanner;  

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();
        int valor = 0;
        System.out.println(valor++);

        System.out.printf("qual operação quer utilizar\n");
                System.out.printf("1 - Multiplicação\n");
                System.out.printf("2 - Divisão\n");
                System.out.printf("3 - Adição\n");
                System.out.printf("4 - Subtração\n");
                System.out.printf("5 - Resto\n");
                System.out.printf("6 - raiz quadrada\n");
                System.out.printf("7 - potência\n");
        System.out.print("Escolha uma operação: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                    case 1:
                        System.out.printf("%f * %f = %f\n", num1, num2, num1 * num2);
                        break;
                    case 2:
                        System.out.printf("%f / %f = %f\n", num1, num2, num1 / num2);
                        break;
                    case 3:
                        System.out.printf("%f + %f = %f\n", num1, num2, num1 + num2);
                        break;
                    case 4:
                        System.out.printf("%f - %f = %f\n", num1, num2, num1 - num2);
                        break;
                    case 5:
                        System.out.printf("%f %% %f = %f\n", num1, num2, num1 % num2);
                        break;
                    case 6:
                        System.out.printf("raiz quadrada de %f = %f\n", num1, Math.sqrt(num1));
                        break;
                    case 7:
                        System.out.printf("%f ^ %f = %f\n", num1, num2, Math.pow(num1, num2));
                    default:
                        System.out.println("Opção inválida!");
                }
        } 
}
    