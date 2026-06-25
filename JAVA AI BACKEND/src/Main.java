import java.util.Scanner;  

public class Main {
   public static void main(String[] args) {
        int value1 = 6;
        String binaryValue = Integer.toBinaryString(value1);
        int value2 = 2;
        String binaryValue2 = Integer.toBinaryString(value2);
        System.out.printf("Primeiro valor: %d (binário: %s)\n", value1, binaryValue);
        System.out.printf("Segundo valor: %d (binário: %s)\n", value2, binaryValue2);
        int result = value1 >> value2;
        String binaryResult = Integer.toBinaryString(result);
        System.out.printf("Resultado do AND: %s >> %s = %s (binário: %s)\n", binaryValue, binaryValue2, result, binaryResult);
   }
}
    