import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
            int menor, maior;
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
            maior = numeros[0];
            menor = numeros[0];
            for(int x = 0; x < numeros.length; x++){
                if(numeros[x] > maior){
                    maior = numeros[x];

                } else if (numeros[x] < menor) {
                    menor = numeros[x];

                }
            }
        System.out.println("O maior eh: " + maior);
        System.out.println("O menor eh: " + menor);

        }
    }

