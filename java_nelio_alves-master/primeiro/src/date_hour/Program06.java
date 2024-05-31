package date_hour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program06 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-10T10:20:30Z"));
        //no temrinal temos a exibição de 7h pois usando o instante, temos a diferença de horas por conta do GMT
        System.out.println(sdf.format(d));


        //adicionando datas, horas etc
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //cal.add(Calendar.HOUR_OF_DAY, 4);
        //d = cal.getTime();

        System.out.println(sdf.format(d));

        //obtendo uma unidade de tempo
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + (cal.get(Calendar.MONTH));
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        //janeiro começa com 0, por isso temos o mes como 5 e nao 6
        //adicionamos o numero um em month
    }
}
