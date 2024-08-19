import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = entrada.nextInt();
        System.out.print("Numero 2: ");
        int num2 = entrada.nextInt();

        if(num1 > num2) {
            System.out.printf("O numero %d eh maior", num1);

        } else if (num2 > num1) {
            System.out.printf("O numero %d eh maior", num2);

        } else {
            System.out.println("Os numeros sao iguais");
        }
    }

}
