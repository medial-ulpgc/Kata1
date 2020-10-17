package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    
    private final String name;
    private final LocalDate birthdate;
    
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public int getAge(){
        return Period.between(birthdate, LocalDate.now()).getYears();
    }
    
}
