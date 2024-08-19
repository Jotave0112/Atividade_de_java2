import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero de acordo com dia da semana; Exemp(1-Domingo/2-Segunda)");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda");
                break;
            case 3:
                System.out.print("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.print("Quinta");
                break;
            case 6:
                System.out.print("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
            default:
                System.out.println("Invalido");
        }
    }
}
