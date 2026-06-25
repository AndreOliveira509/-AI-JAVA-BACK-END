import java.util.Scanner;


public class testdivnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        while (true) {
            System.out.println("Digite um numero maior que o primeiro: ");
            int numero2 = scanner.nextInt();
            //ignorar numeros menores que o primeiro

            if (numero2 < numero) {
                System.out.println("Número inválido. Por favor, digite um número maior que " + numero + ".");
                continue;
            }else if(numero2 % numero != 0){
                System.out.println("Digite outro numero, a ideia é o resto dar 0.");
                continue;
                
            } else {
                System.out.println("O número " + numero2 + " é divisível por " + numero + ", e o final da 0.");
                break;
            }
        }
    }
}
