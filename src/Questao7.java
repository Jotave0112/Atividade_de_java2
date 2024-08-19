import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        float aumento = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu salario: ");
        float salario = entrada.nextFloat();
        float antigosal = salario;

        if(salario <= 280.00f){
            aumento = (salario * 0.20f);
            salario = aumento + salario;
        } else if (salario <= 700.00f) {
            aumento = (salario * 0.15f);
            salario = aumento + salario;
        } else if (salario <= 1500) {
            aumento = (salario * 0.10f);
            salario = aumento + salario;
        } else if (salario > 1500) {
            aumento = (salario * 0.05f);
            salario = salario + aumento;
        }
        System.out.printf("Antes %f / Depois %f / Aumento %f", antigosal, salario, aumento);
    }
}
