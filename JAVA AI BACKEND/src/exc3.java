import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o base de um retangulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A área do retangulo é: " + area);
    }   
}
