package date_hour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class program04 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); //formatação com dias
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //formatação com dias e horas

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //formatação com dias e horas com base no fuso horário
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); //pegamos o dia da variavel d06 e subtraimos 7 dias com o operador minus

        LocalDate pastWeek = d04.minusWeeks(1); //subtraimos semanas com o minuWeeks
        LocalDate nextWeek = d04.plusWeeks(1); //adicionamos uma semana com o plusWeeks

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println(pastWeek);
        System.out.println(nextWeek);
        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);
        System.out.println(t1.toDays());

        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());


    }
}
