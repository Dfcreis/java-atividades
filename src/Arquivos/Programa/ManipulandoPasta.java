package Arquivos.Programa;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo");
        String caminho = sc.nextLine();

        File file = new File(caminho);
        File[] folder = file.listFiles(File::isDirectory);
        for (File f : folder) {
            System.out.println(f);
        }
        File[] arquivos = file.listFiles(File::isFile);
        System.out.println("Files");
        for (File f : arquivos) {
            System.out.println(f);
        }
        boolean sucesso = new File(caminho+ "//novo").mkdir();
        System.out.println("O arquivo foi criado com sucesso " + sucesso);


        sc.close();
    }
}
