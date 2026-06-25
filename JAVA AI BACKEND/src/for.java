import java.util.Scanner;


class Tabuada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (String arg : args) {
           
            System.out.println( arg);
        }
        
        int i = 1;
        do {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        } while (i < 11);
    }
}
