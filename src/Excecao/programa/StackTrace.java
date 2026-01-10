package Excecao.programa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {
        mathod1();

    }

    public static void mathod1(){
        System.out.println("Start mathod 1");
        mathod2();
        System.out.println("End mathod 1");
    }

    public static void mathod2 (){
        System.out.println("Start mathod 2");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        System.out.println("End mathod 2");
        sc.close();
    }
}
