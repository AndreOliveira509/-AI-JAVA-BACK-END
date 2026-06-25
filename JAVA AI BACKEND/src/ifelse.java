import java.util.Scanner;  

public class ifelse {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        String emancipated = scanner.next();
        boolean isEmancipated = emancipated.equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.println("Olá, " + name + ", voce tem " + age + " anos! Você é maior de idade.");
    } else if (age >= 16 && isEmancipated) {
            System.out.println("Olá, " + name + ", voce tem " + age + " anos! Você é emancipado.");
        }
        else {
            System.out.println("Olá, " + name + ", voce tem " + age + " anos! Você é menor de idade.");
        }
}  
}
    