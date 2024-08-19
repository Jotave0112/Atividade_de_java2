import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = entrada.nextFloat();

        float media = (nota1 + nota2)  / 2;

        if(media >= 7) {
            System.out.print("Aprovado");
        } else if (media < 7) {
            System.out.print("Reprovado");
        } else if (media > 10) {
            System.out.print("Aprovado com distincao");
        }

    }
}
