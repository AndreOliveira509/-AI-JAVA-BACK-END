import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    500   System.out.println("Digite o salario Bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.println("Digite adicional dos Beneficios: ");
        double adicionalBeneficios = scanner.nextDouble();
        if (salarioBruto <= 1100) {
            double imposto = salarioBruto * 0.05;
            double salarioLiquido = salarioBruto - imposto + adicionalBeneficios;
            System.out.println("Seu salário líquido é: " + salarioLiquido);
        }else if (salarioBruto < 2500) {
            double imposto = salarioBruto * 0.10;
            double salarioLiquido = salarioBruto - imposto + adicionalBeneficios;
            System.out.println("Seu salário líquido é: " + salarioLiquido);
        } else {
            double imposto = salarioBruto * 0.15;
            double salarioLiquido = salarioBruto - imposto + adicionalBeneficios;
            System.out.println("Seu salário líquido é: " + salarioLiquido);
        }

        }
}
