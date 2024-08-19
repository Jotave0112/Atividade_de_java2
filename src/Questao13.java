import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        int n = 5;
        double h = 0;

        for(int x = 1; x <= n; x++){
            h += 1.0 / x;
        }
        System.out.printf("O valor em %d eh %f termos", n,h);
    }
}
