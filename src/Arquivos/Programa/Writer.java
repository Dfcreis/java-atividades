package Arquivos.Programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

    String[] linhas = new String[]{"Bom dia","Boa tarde"};
    String caminho = "C:\\temp\\out.txt";

    try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
        for (String line : linhas){
            bw.write(line);
            bw.newLine();
        }

    }
    catch (IOException e){
        e.printStackTrace();
    }
    }
}
