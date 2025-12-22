package DataHora;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DhTxt {
    public static void main(String[] args) {

    LocalDate d01 = LocalDate.parse("2025-12-24");
    LocalDateTime d02 = LocalDateTime.parse("2025-12-25T15:22");
    Instant d03 = Instant.parse("2025-12-26T15:22:30Z");

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("d01 :"+ d01.format(dtf));

    System.out.println("d02 :"+ d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    System.out.println("d03 :"+ dtf2.format(d03));




    }}
