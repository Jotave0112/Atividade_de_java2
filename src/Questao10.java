import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        int count = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero para fazer a tabuada: ");
        int tabuada = entrada.nextInt();

        for(int x = 0; x < 10; x++){
            int resultado = tabuada * count;
            System.out.printf("%d x %d = %d \n", tabuada, count, resultado);
            count++;

        }
    }
}
