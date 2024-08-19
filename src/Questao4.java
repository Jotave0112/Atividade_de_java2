import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int antes = 0;
        int[] numeros = new int[3];
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = entrada.nextInt();
        numeros[0] = num1;
        System.out.print("Numero 2: ");
        int num2 = entrada.nextInt();
        numeros[1] = num2;
        System.out.print("Numero 3: ");
        int num3 = entrada.nextInt();
        numeros[2] = num3;

        for(int x = 0; x < numeros.length; x++) {

            if(numeros[x] > antes) {
               antes = numeros[x];

            } else {
                break;
            }
        } System.out.println("O numero maior eh: " + antes);
    }
}
