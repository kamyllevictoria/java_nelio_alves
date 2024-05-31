package date_hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class program01 {
    public static void main(String[] args) {
        //padrao criado para formatação de datas com o datetimeoformatter
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2022-01-01");
        LocalDateTime d5 = LocalDateTime.parse("2022-01-01T14:56:01");
        Instant d6 = Instant.parse("2022-01-03T01:01:02Z");

        LocalDate d8 = LocalDate.of(2022,07,020);
        LocalDate d7 = LocalDate.parse("20/07/2023", fmt1);
        LocalDate d9 = LocalDate.from(LocalDateTime.of(2022,07,20,1,30));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d9);
    }
}
