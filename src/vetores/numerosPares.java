package vetores;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("Quantos numeros vai digitar?");
        int numerosVaiDigit = sc.nextInt();

        int[] numeros = new int[numerosVaiDigit];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("digite um numero: ");
            numeros[i] = sc.nextInt();
        }





        int pares = 0;
        for (int i =0;i<numeros.length;i++){
            if (numeros[i] % 2 == 0){
                pares++;
            }
        }

            int j = 0;
            int[] np = new int[pares];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                np[j] = numeros[i];
            }
            }


        System.out.println("Numeros pares "+Arrays.toString(np));

        System.out.println("voce digitou "+pares+" numeros pares");


        sc.close();
    }
}
