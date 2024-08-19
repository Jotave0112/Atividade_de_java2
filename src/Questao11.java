import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero para fazer a tabuada: ");
        int tabuada = entrada.nextInt();
        System.out.print("Comecara em que numero? ");
        int comeca = entrada.nextInt();
        System.out.print("Quando terminara: ");
        int terminar = entrada.nextInt();

        for(int x = comeca; x < terminar + 1; x++){
            int resultado = tabuada * comeca;
            System.out.printf("%d x %d = %d \n", tabuada, comeca, resultado);
            comeca++;
            if(comeca > terminar){
                break;
            }

        }
    }
}
