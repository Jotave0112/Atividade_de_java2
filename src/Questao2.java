import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = entrada.nextInt();

        if(num > 0) {
            System.out.printf("O numero %d eh positivo", num);

        } else if (num < 0) {
            System.out.printf("O numero %d eh negativo", num);

        }
    }
}
