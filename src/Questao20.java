import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        String[] vetor = {"windows", "unix", "linux", "mac", "netware", "outros"};
        float totaldevotos;
//        1- Windows Server
//        2- Unix
//        3- Linux
//        4- Netware
//        5- Mac OS
//        6- Outro
        int[] votar = new int[7];
        votar[0] = 0;
        votar[1] = 0;
        votar[2] = 0;
        votar[3] = 0;
        votar[4] = 0;
        votar[5] = 0;

        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Qual voce dejesa votar? windows \n" +
                    "//        unix\n" +
                    "//        linux\n" +
                    "//        netware\n" +
                    "//        mac\n" +
                    "//        outro ");
            String respostas = entrada.next();

            if(respostas.equals("windows")){
                votar[0] = votar[0] + 1;
            } else if(respostas.equals("unix")) {
                votar[1] = votar[1] + 1;
            } else if (respostas.equals("linux")){
                votar[2] = votar[2] + 1;
            } else if (respostas.equals("netware")) {
                votar[3] = votar[3] + 1;
            } else if (respostas.equals("mac")){
                votar[4] = votar[4] + 1;
            } else if (respostas.equals("outro")) {
                votar[5] = votar[5] + 1;
            }  totaldevotos = votar[0] + votar[1] + votar[2] + votar[3] + votar[4] + votar[5];
            System.out.println("Quer continuar? ");
             String continuar = entrada.next();
             if(continuar.equals("sim")) {
                 System.out.print("");
             } else {
                 break;
             }


            } for(int x = 0; x <= votar.length; x++){
                float percentual;
                percentual = (votar[x]/totaldevotos) * 100;
            System.out.print(vetor[x] + " | " + votar[x] + " | " + percentual + "%" +"\n");
        }
        }
    }

