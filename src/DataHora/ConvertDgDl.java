package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDgDl {
    public static void main(String[] args) {
    LocalDate d01 = LocalDate.parse("2025-12-24");
    LocalDateTime d02 = LocalDateTime.parse("2025-12-25T15:22:55");
    Instant d03 = Instant.parse("2025-12-26T01:53:30Z");

    LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
    System.out.println("r1 :"+ r1);
    LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
    System.out.println("r2 :"+ r2);

    LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
    System.out.println("r3 :"+ r3);
    System.out.println("r4 :"+ r4);


        System.out.println("d01 dia:"+ d01.getDayOfMonth());
        System.out.println("d01 mes:"+ d01.getMonthValue());
        System.out.println("d01 ano:"+ d01.getYear());
        System.out.println();
        System.out.println("d02 Hora:"+ d02.getHour());
        System.out.println("d02 Minuto:"+ d02.getMinute());
        System.out.println("d02 Segundo:"+ d02.getSecond());
    }
}
