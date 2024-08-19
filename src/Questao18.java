import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        int count = 0; // Inicializando a variável count
        String[] lista = new String[5];
        Scanner entrada = new Scanner(System.in);

        System.out.print("Telefonou para a vítima? ");
        String pergunta1 = entrada.next();
        System.out.print("Esteve no local do crime? ");
        String pergunta2 = entrada.next();
        System.out.print("Mora perto da vítima? ");
        String pergunta3 = entrada.next();
        System.out.print("Devia para a vítima? ");
        String pergunta4 = entrada.next();
        System.out.print("Já trabalhou com a vítima? ");
        String pergunta5 = entrada.next();

        if (pergunta1.equals("sim")) {
            count += 1;
        }
        if (pergunta2.equals("sim")) {
            count += 1;
        }
        if (pergunta3.equals("sim")) {
            count += 1;
        }
        if (pergunta4.equals("sim")) {
            count += 1;
        }
        if (pergunta5.equals("sim")) {
            count += 1;
        }

        switch (count) {
            case 0:
            case 1:
                System.out.println("Você eh inocente.");
                break;
            case 2:
                System.out.println("Você eh suspeito.");
                break;
            case 3:
            case 4:
                System.out.println("Você eh cúmplice.");
                break;
            case 5:
                System.out.println("Você eh o assassino.");
                break;
            default:
                System.out.println(" ");
        }
    }
}

