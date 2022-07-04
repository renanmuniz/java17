package cap4;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateApi {
    public static void main(String[] args) {
        System.out.println(LocalDate.now()); //2022-07-04
        System.out.println(LocalTime.now()); //14:27:59.567824369
        System.out.println(LocalDateTime.now()); //2022-07-04T14:27:59.567889099
        System.out.println(ZonedDateTime.now()); //2022-07-04T14:27:59.568370168-03:00[America/Sao_Paulo]
        System.out.println(LocalDate.of(2022, Month.JUNE, 22)); //2022-06-22
        System.out.println(LocalDate.of(2022, 6, 22)); //2022-06-22
        System.out.println(LocalTime.of(6, 15, 30)); //06:15:30
        System.out.println(LocalDateTime.of(2022, Month.JUNE, 22, 8, 00, 00)); //2022-06-22T08:00

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20,6, 15, 30, 200, zone);
        System.out.println(zoned1); //2022-01-20T06:15:30.000000200-05:00[US/Eastern]

        zone = ZoneId.of("Brazil/East");
        var zoned2 = ZonedDateTime.of(2022, 1, 20,6, 15, 30, 200, zone);
        System.out.println(zoned2); //2022-01-20T06:15:30.000000200-03:00[Brazil/East]

        var daily = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily);

        var hourly = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(hourly);


        // Ver duração de um instant e outro:
        var now = Instant.now();

        try{ for(int x=0; x<100; x++) {
            System.out.print(".");
            Thread.sleep(25); // só para pausar um pouco e deixar o tempo passar.
        } } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        var later = Instant.now();
        var duration = Duration.between(now, later);

        System.out.println("\nDuração: " + duration.toSeconds() + " segundos.");
    }
}
