package vetores;



import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[]args){
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

        System.out.println("Quantos voçê vai digitar ?");
        int n = sc.nextInt();
        double[] numeros = new double[n];


        //repetiçao para guardar os valores no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        // repetiçao para imprimir os valores do vetor

        System.out.println("Vetores" +Arrays.toString(numeros));


        double soma = 0.00;
        // repetiçao para somar os valores do vetor
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.printf("Soma = %.2f%n",soma);

        //calculando a media dos vetores
        double media = soma/numeros.length;
        System.out.printf("media = %.2f%n",media);

    sc.close();
    }
}
