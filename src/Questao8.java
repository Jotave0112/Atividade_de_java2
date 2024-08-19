import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        float aumento = 0;
        float inss = 0.10f;
        float fgts = 0.11f;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de horas: ");
        float horas = entrada.nextFloat();
        System.out.print("Digite o valor de horas por mes: ");
        float horames = entrada.nextFloat();
        float salario = horas * horames;
        float salariolq = salario;

        if(salario <= 900.00f){
            salario = salario + 0;
        } else if (salario <= 1500.00f) {
            salario = salario - ((salario * 0.05f) + (salario * inss) + (salario * fgts));
        } else if (salario <= 2500) {
            salario = salario - ((salario * 0.10f) + (salario * inss) + (salario * fgts));
        } else if (salario > 2500) {
            salario = salario - ((salario * 0.20f) + (salario * inss) + (salario * fgts));
        }
        System.out.printf("Salario Liquido eh: %f", salario);
    }
}
