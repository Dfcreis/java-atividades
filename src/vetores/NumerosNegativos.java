package vetores;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos nueros de -10 a 10 voce deseja digitar ?");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        if (n >= -10 && n <= 10){
        for (int i = 0; i < numeros.length; i++){

            System.out.println("Digite um numero:");
            numeros[i] =  sc.nextInt();
        }

        for (int num : numeros){
            if(num < 0){
                System.out.println("Os numeros negativos digitados foram: ");
                System.out.println(num);
            }
        }
        }
        else {
            System.out.println("[ERRO] valor invalido");
        }




        sc.close();
    }
}
