package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Hortensio",LocalDate.of(1971, Month.APRIL, 22));
        System.out.println(person.getName() +" tiene  "+ person.getAge());
                
    }
    
}
