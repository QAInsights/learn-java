package org.practice1;

import java.math.BigDecimal;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

import static java.lang.System.out;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime t = LocalTime.now();
        out.println(t);

        LocalDateTime tt = LocalDateTime.now();
        out.println(tt);

        ZonedDateTime zz = ZonedDateTime.now();
        out.println(zz);

        var dd = LocalDate.of(2025, 12, 3);
        out.println(dd);

        var d3 = LocalDate.of(Year.MAX_VALUE, Month.OCTOBER, 1);
        out.println(d3);
        var d4 = LocalDate.of(2025, Month.OCTOBER, 1);
        out.println(d4);

        var dt = LocalDateTime.of(2025, 1, 1, 8, 1, 1, 1);
        out.println(dt);

        for (String x : ZoneId.getAvailableZoneIds()) {
            out.println(x);
            ZoneId xx = ZoneId.of(x);
            ZonedDateTime zzz = ZonedDateTime.of(2025,
                    1, 1, 1, 1, 1, 1, xx);
            out.println(zzz);
        }

        var t1 = LocalDate.now();
        t1 = t1.plusDays(100000000L);
        t1 = t1.plusWeeks(100000000L);
        t1 = t1.plusMonths(100000000L);
        t1 = t1.plusYears(100000000L);
        t1 = t1.minusYears(100000000L);
        out.println(t1);
        out.println(t1.atStartOfDay());
        var t2 = LocalTime.now();
        out.println(t1.atTime(t2));

        var today = "null";

        out.println("The list of Zone Ids: ");
        for (String s : ZoneId.getAvailableZoneIds()) {

            out.println(s);
        }

        var t3 = LocalDate.now();
        var p = Period.ofMonths(1);
        out.println(p);
        var p2 = t3.plus(p);
        out.println(p2);
        p = Period.ofDays(11);
        out.println(p);
        out.println(p.getMonths());
        out.println(t3.plus(p));
        p = Period.of(1, 1, 1);
        out.println(p);
        out.println(t3.plus(p));

        var xmas = LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 25);
        var nyear = LocalDate.of(LocalDate.now().getYear() + 1, Month.JANUARY, 1);
        var jananyaBDay = LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 31);

        var pBetween = Period.between(xmas, nyear);
        out.println(pBetween); //   P7D
        pBetween = Period.between(nyear, xmas);
        out.println(pBetween); //   P-7D

        pBetween = Period.between(xmas, jananyaBDay);
        out.println(pBetween); //   P6D
        pBetween = Period.between(jananyaBDay, nyear);
        out.println(pBetween); //   P1D
        pBetween = Period.between(nyear, jananyaBDay);
        out.println(pBetween);

        out.println(Duration.ofDays(11));
        var daily = Duration.of(1, ChronoUnit.DAYS);
        out.println(daily);

        var start = LocalTime.of(1, 11);
        var end = LocalTime.of(21, 1, 11);
        out.println(ChronoUnit.HOURS.between(end, start));
        out.println(ChronoUnit.MINUTES.between(end, start));
        out.println(start.truncatedTo(ChronoUnit.HOURS));

        out.println(Instant.now()); // GMT
        var time = LocalTime.now();
        var tzz = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        out.println(tzz.getOffset());
        out.println(tzz);
        out.println(tzz.toInstant());

        var est = ZonedDateTime.now(ZoneId.of("America/New_York"));
        out.println(est);
        out.println(est.getOffset());
        var pp1 = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Asia/Kolkata"));
        out.println(pp1);
        out.println(pp1.getOffset());

        int[] arr = new int[]{1, 2, 2};
        int[] arr1 = new int[11];


    }
}
