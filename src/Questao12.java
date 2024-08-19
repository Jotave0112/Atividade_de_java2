import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] saltos = new float[5];
        float maior, menor;
        System.out.print("Digite distancia do primeiro salto: ");
        float umsalto = entrada.nextFloat();
        saltos[0] = umsalto;
        System.out.print("Digite a distancia do segundo salto: ");
        float doissalto = entrada.nextFloat();
        saltos[1] = doissalto;
        System.out.print("Digite a distancia do terceiro salto: ");
        float tressalto = entrada.nextFloat();
        saltos[2] = tressalto;
        System.out.print("Digite a distancia do quarto salto: ");
        float quartsalto = entrada.nextFloat();
        saltos[3] = quartsalto;
        System.out.print("Digite a distancia do quinto salto: ");
        float cincosalto = entrada.nextFloat();
        saltos[4] = cincosalto;
        float media = (umsalto + doissalto + tressalto + quartsalto + cincosalto) / saltos.length;
        maior = saltos[0];
        menor = saltos[0];

        for(int x = 0; x < saltos.length; x++) {

            if(saltos[x] > maior) {
                maior = saltos[x];
            } else if (saltos[x] < menor) {
                menor = saltos[x];
            }

        } System.out.printf("Primeiro Salto: %f \n", umsalto);
        System.out.printf("Segundo Salto: %f \n", doissalto);
        System.out.printf("Terceiro Salto: %f \n", tressalto);
        System.out.printf("Quarto Salto: %f \n", quartsalto);
        System.out.printf("Quinto Salto: %f \n", cincosalto);
        System.out.printf("Maior Salto: %f \n", maior);
        System.out.printf("Menor Salto: %f \n", menor);
        System.out.printf("Media de Saltos: %f \n", media);
        System.out.printf("Resultado: %f \n", media);
    }
}
