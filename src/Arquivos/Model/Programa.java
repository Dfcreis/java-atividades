package Arquivos.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Arquivo> list = new ArrayList<>();

        System.out.print("Enter file path :");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolder = sourceFile.getParent();

        boolean success = new File(sourceFolder + "\\out").mkdir();


        System.out.println("Source file existe :" + success);

        String targetFileStr = sourceFolder + "\\out.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] items = itemCsv.split(",");
                String name = items[0];
                double price = Double.parseDouble(items[1]);
                int quantity = Integer.parseInt(items[2]);

                list.add(new Arquivo(name, price, quantity));

                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Arquivo arquivo : list) {
                    bw.write(arquivo.getName() + ","+String.format("%.2f",arquivo.calcularTotal()));
                    bw.newLine();
                }
                System.out.println(targetFileStr+ " Criado com sucesso");

            }
            catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }






        sc.close();
    }
}
