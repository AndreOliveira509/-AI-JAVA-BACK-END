import java.util.Scanner;

public class mostranum {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Digite um numero maior que o primeiro: ");
        int numero2 = scanner.nextInt();
        System.out.println("Agora escolha (pares(p) ou impares(i)):  ");
        String escolha = scanner.next().toLowerCase();
        if (escolha.equals("p")) {
            for (int i = numero; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (escolha.equals("i")) {
            for (int i = numero; i <= numero2; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Escolha inválida. Por favor, digite 'p' para pares ou 'i' para ímpares.");
        }
    } 
}
