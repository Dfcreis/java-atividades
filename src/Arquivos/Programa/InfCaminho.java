package Arquivos.Programa;

import java.io.File;
import java.util.Scanner;

public class InfCaminho {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();
        File file = new File(caminho);
        System.out.println("getName :"+file.getName());
        System.out.println("getParent :"+file.getParent());
        System.out.println("getPath :"+file.getPath());
    }
}
