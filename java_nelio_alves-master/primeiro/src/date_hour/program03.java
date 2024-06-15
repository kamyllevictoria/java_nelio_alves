package date_hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class program03 {
    public static void main(String[] args) {
        //Convertemos uma data global para uma local usando o timezone
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDate r3 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDate r4 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


        System.out.println("d04 hour:" + d04.getDayOfMonth());
        System.out.println("d04 month: " + d04.getMonth());
        System.out.println("d04 month value: " + d04.getMonthValue());
    }
}
