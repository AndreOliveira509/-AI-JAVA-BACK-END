import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para representar o dia da semana: ");
        int dia = scanner.nextInt();
        String nomeDia;

        switch (dia) {
            case 1:
            case 7:
                nomeDia = dia == 1 ? "Domingo" : "Sábado";
                System.out.println("É final de semana: " + nomeDia);
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            default:
                nomeDia = "Número inválido. Por favor, digite um número de 1 a 7.";
        }

        System.out.println("O dia da semana correspondente é: " + nomeDia);
    }
}
