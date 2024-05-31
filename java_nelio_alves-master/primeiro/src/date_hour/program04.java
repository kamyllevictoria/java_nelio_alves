package date_hour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class program04 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        //Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        LocalDate pastWeek = d04.minusWeeks(1);
        LocalDate nextWeek = d04.plusWeeks(1);

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
        //nao tem como calcular temo de duração com o localdate, so com o localdayetime
        //realizamos a conversão com o alTime no durantion t1 ou podemos usar o atStratOfTheDay
        //é menos gambiarra
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());


    }
}
