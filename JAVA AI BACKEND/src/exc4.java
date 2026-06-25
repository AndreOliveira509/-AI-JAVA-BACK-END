import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String name1 = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int age1 = scanner.nextInt();
        System.out.println("Digite seu nome:");
        String name2 = scanner.next();
        System.out.println("Digite sua idade:");   
        int age2 = scanner.nextInt();
        int maior = age2;
        int menor = age1;
        if (age1 > age2) {
            maior = age1;
            menor = age2;
        }
        int diferenca = maior - menor;
        System.out.println("A diferença de idade é: " + diferenca);
       }
    }   

