package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o numero de pessoas");
        int p = sc.nextInt();
        System.out.println("Digite o numero de alturas");

        //importar o vetor
        double[] alturas = new double[p];

        // repetição para dicionar valores no vetor
        for (int i = 0; i< p; i++){
            alturas[i]=sc.nextDouble();
        }

        // repetiçao para calcular os valores do vetor
        double soma = 0.0;
        for (int i = 0; i <p ; i++){
            soma += alturas[i];
        }

        // calcular a media dos valores
        double media = soma / p ;

        // imprimir na tela a media.
        System.out.printf("A media de altura entres as pessoas e : %.2f%n",media);



    sc.close();
    }
}
