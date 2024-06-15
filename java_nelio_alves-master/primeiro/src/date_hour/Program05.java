package date_hour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Program05 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("----------------");
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/08/2025 15:41:07");
        System.out.println(y1);
        System.out.println(y2);
        //formatar com base no nosso simpledateformat personalizado:
        System.out.println(sdf2.format(y2));

       //java format
        System.out.println(sdf3.format(y1));
        System.out.println(y2);

        //data atual
        Date day1 = new Date();
        Date day2 = new Date(System.currentTimeMillis());
        Date day3 = new Date(0L); //zero milissegundos
        Date day4 = new Date(1000L * 60L * 60L * 5);

        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
    }
}
