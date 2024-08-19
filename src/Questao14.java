import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();

        for(int x = 1; x <= num ; x++){
            System.out.print("\n");
            for(int y = 1; y <= x; y++){
                System.out.print(x + " ");

            }
        }
    }
}
