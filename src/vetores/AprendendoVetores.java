package vetores;

import java.util.Arrays;

public class AprendendoVetores {
    public static void main(String[] args) {

                    // Armazena varios valores do mesmo tipo
                    // tipo[] nomeVariavel = new String[tamanho];
        String[] nomes = new String[5];
        // 0, 1, 2, 3, 4

        double[] numeros = new double[]{
          1.1, 1.2, 1.3, 1.4, 1.5
        };
        // tambem ja pode criar o array com valores atribuidos


        // adicionando valor do array nome
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        nomes[3] = "Antonio";
        nomes[4] = "Jose";

        //estrutura de repetição para imprimir os valores

        for(int posicaoVetor = 0;posicaoVetor < 5; posicaoVetor++){
            System.out.println(nomes[posicaoVetor]);
        }

        System.out.println();

        for(int i = 0; i < numeros.length ; i++){
            System.out.println(numeros[i]);
        }
        System.out.println();


                            // Classe array
        int[] n2 = new int[100];
        // preenche o Array com um valor
        Arrays.fill(n2, 12);

        //Imprime todos os valores do array
        System.out.println(Arrays.toString(n2));

    }
}
