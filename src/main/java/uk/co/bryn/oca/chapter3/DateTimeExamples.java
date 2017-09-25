package uk.co.bryn.oca.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author david.stevenson
 */
public class DateTimeExamples {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDate date = LocalDate.now();
        System.out.println(date.format(dateTimeFormatter));
        System.out.println(dateTimeFormatter.format(date));

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3).ofYears(2);
        d = d.minus(p);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }
}
