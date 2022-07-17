package by.academy.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeDate {
    public static boolean dateCheck(String dateInput) {
        Pattern pattern = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        Matcher matcher = pattern.matcher(dateInput);
        if (matcher.matches()) {
            DateTimeFormatter formatterDT = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
            LocalDate ld = LocalDate.parse(dateInput, formatterDT);

            System.out.println("Month: " + ld.getMonth());
            System.out.println("Day:" + ld.getDayOfMonth());
            System.out.println("Year:" + ld.getYear());
        } else {
            pattern = Pattern.compile("\\d{1,2}-\\d{1,2}-\\d{4}");
            matcher = pattern.matcher(dateInput);
            if (matcher.matches()) {
                DateTimeFormatter formatterDT = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
                LocalDate ld = LocalDate.parse(dateInput, formatterDT);
                System.out.println("Month: " + ld.getMonth());
                System.out.println("Day:" + ld.getDayOfMonth());
                System.out.println("Year:" + ld.getYear());
            } else {
                System.out.println("You enter incorrect date!");
            }
        }
        return matcher.matches();
    }
}

//       System.out.printf("\\d{1,2}\\/\\d{1,2}\\/\\d{4}" ,"Date:",  dateInput);
//          System.out.printf("%1$s %2$td %2$tB %2$tY", "Date:", dateInput);
