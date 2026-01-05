package Excecao.solucao1.application;

import Excecao.solucao1.model.DomainException;
import Excecao.solucao1.model.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room Number");
            int room = sc.nextInt();
            System.out.print("Check-in Date dd/MM/yyyy");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out Date dd/MM/yyyy");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(room, checkin, checkout);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("check-in Date dd/MM/yyyy");
            checkin = sdf.parse(sc.next());
            System.out.print("check-out Date dd/MM/yyyy");
            checkout = sdf.parse(sc.next());

            Reservation reservation1 = new Reservation(room, checkin, checkout);
            System.out.println("Reservation " + reservation);


            reservation.upDateDates(checkin, checkout);

            System.out.println("[Erro] in reservation " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date");
        } catch (DomainException e) {
            System.out.println("Erro in reservation "+e.getMessage());
        }

        sc.close();
    }
}
