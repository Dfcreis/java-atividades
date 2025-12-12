package vetores;

import entidades.Hotel;

import java.util.Locale;
import java.util.Scanner;

public class AluguelQuarto {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hotel[] hotel = new Hotel[10];

        System.out.println("How many rooms will be rented? ");
        int retedRooms = sc.nextInt();

         for (int i = 0; i < retedRooms; i++) {
             System.out.println();
             System.out.println("Rent #" + (i + 1) + " :");
             System.out.print("Name: ");
             sc.nextLine();
             String name = sc.nextLine();
             System.out.print("Email: ");
             String email = sc.next();
             System.out.print("Rooms: ");
             int rooms = sc.nextInt();
             hotel[rooms] = new Hotel(name, email);
         }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (hotel[i] != null){
                System.out.println(i + ": " + hotel[i]);
            }
        }




    }


}
