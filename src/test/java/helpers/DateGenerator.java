package helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateGenerator   {

    private String randomGeneratedDate;

    public void setRandomGeneratedDate(){
        LocalDate randomDate = createRandomDate(1900, 2000);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        this.randomGeneratedDate = randomDate.format(formatter);
    }

    public String getRandomGeneratedDate()
    {
        setRandomGeneratedDate( );
        return randomGeneratedDate;

    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
        }

        public static LocalDate createRandomDate(int startYear, int endYear) {
            int day = createRandomIntBetween(1, 28);
            int month = createRandomIntBetween(1, 12);
            int year = createRandomIntBetween(startYear, endYear);
            return LocalDate.of(year, month, day);
        }
    }

