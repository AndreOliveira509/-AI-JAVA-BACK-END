import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Você tem " + idade + " anos.");
    }   
}
