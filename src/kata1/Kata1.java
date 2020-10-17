package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Hortensio",new Date(81,11,23));
        
        System.out.println(person.getName() +" tiene  "+ person.getAge());
                
    }
    
}
