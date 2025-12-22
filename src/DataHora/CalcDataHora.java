package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcDataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-12-24");
        LocalDateTime d02 = LocalDateTime.parse("2025-12-25T15:22");
        Instant d03 = Instant.parse("2025-12-26T15:22:30Z");

        System.out.println();
        System.out.println("Data Local :"+d01);
        LocalDate diasantes = d01.minusDays(7);
        LocalDate diasseguinte = d01.plusDays(7);
        System.out.println("Dias antes: " + diasantes);
        System.out.println("Dias seguintes: " + diasseguinte);

        System.out.println();
        System.out.println("Data-Hora Local :"+d02);
        LocalDateTime diasDepois2 = d02.plusDays(12);
        System.out.println("Dias e Horas depois : " + diasDepois2);
        LocalDateTime diasAntes2 = d02.minusDays(7);
        System.out.println("Dias e Horas antes : " + diasAntes2);
        LocalDateTime diaseHoras = d02.plusHours(4);
        System.out.println("Proximas Horas " + diaseHoras);
        LocalDateTime diasseHoras2 = d02.minusHours(4);
        System.out.println("Horas Antes " + diasseHoras2);

        System.out.println();
        System.out.println("Global dia-hora: "+ d03);
        Instant globalDiasA = d03.minus(7, ChronoUnit.DAYS);
        System.out.println("Global dias antes: " + globalDiasA);
        Instant globalDias = d03.plus(7, ChronoUnit.DAYS);
        System.out.println("Global dias Depois: " + globalDias);

        System.out.println();
        Duration d = Duration.between(diasantes.atStartOfDay(),diasseguinte.atStartOfDay());
        System.out.println("Duracao data local"+ d);




        System.out.println();
        Duration d1 = Duration.between(diasAntes2, diasDepois2);
        System.out.println("Duaracao :"+d1.toDays());
    }
}
