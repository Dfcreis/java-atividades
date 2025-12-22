package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

public static void main(String[] args) {
   //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
   LocalDate d01 = LocalDate.now();
    System.out.println("do1 :"+d01);
    LocalDateTime d02 = LocalDateTime.now();
    System.out.println("do2 :"+d02);
    Instant d03 = Instant.now();
    System.out.println("do3 :"+d03);

    LocalDate d04 = LocalDate.parse("2022-04-20");
    System.out.println("do4 :"+d04);
    LocalDateTime d05 = LocalDateTime.parse("2022-04-20T14:18:50");
    System.out.println("do5 :"+d05);
    Instant d06=Instant.parse("2022-04-20T14:18:50Z");
    System.out.println("do6 :"+d06);
    Instant d07 = Instant.parse("2022-04-20T14:18:50-03:00");
    System.out.println("do7 :"+d07);

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate d08 = LocalDate.parse("24/12/2025", df);

    System.out.println("do8 :"+d08);
    DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    System.out.println("do9 :"+ LocalDateTime.parse("24/12/2025 15:02", df2));


    LocalDate d10 = LocalDate.of(2025, 12, 24);
    LocalDateTime d11 = LocalDateTime.of(2025,12,24,15,11);
    System.out.println("do10 :"+d10);
    System.out.println("do11 :"+d11);


}
}
