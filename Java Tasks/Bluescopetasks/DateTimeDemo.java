package Bluescopetasks;

import java.time.*;
import java.time.format.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        Instant instant = Instant.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime.format(fmt));
        System.out.println("India Time: " + india);
        System.out.println("Instant(UTC): " + instant);

        LocalDateTime parsed = LocalDateTime.parse("2025-12-05 14:30",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("Parsed: " + parsed);

        Period p = Period.between(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31));
        System.out.println("Period: " + p);

        Duration d = Duration.between(LocalTime.of(10, 0), LocalTime.of(12, 30));
        System.out.println("Duration: " + d);

        System.out.println("Next Week: " + date.plusWeeks(1));
    }
}