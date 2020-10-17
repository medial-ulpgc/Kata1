package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);
    
    public Calendar getBirthdate() {
        
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)millisecondsToYears(today.getTimeInMillis() - birthdate.getTimeInMillis());
    }

    private long millisecondsToYears(long milliseconds) {
        return milliseconds/MILLISECONDS_PER_YEAR;
    }
    
}
