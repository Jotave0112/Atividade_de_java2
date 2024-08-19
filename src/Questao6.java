import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual turno voce estuda? ");
        String turno = entrada.next();

        switch (turno) {
            case "m":
                System.out.print("Bom dia!");
                break;
            case "v":
                System.out.print("Boa tarde!");
                break;
            case "n":
                System.out.print("Boa noite!");
                break;
        }
    }
}
