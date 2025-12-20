package matrizes;

import java.util.Scanner;

public class matriz {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor de linhas e colunas na matriz: ");
        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][]math = new int[l][c];

        System.out.println("Preencha a matriz com valor inteiro:");
        for (int i= 0; i<math.length; i++ ){
            for (int j= 0; j<math[i].length; j++ ){
                math[i][j]=sc.nextInt();
            }
        }

        System.out.println("Infome a posicao de x e y na matriz: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0){
            System.out.println("cima :"+math[x-1][y]);
        }
        if (x > 0){
            System.out.println("Esquerda :"+math[x][y-1]);
        }
        if (y > 0){
            System.out.println("Direita :"+math[x][y+1]);
        }
        if (y > 0){
            System.out.println("Baixo :"+math[x+1][y]);
        }






        sc.close();
    }
}
