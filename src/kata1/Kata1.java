package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Álvaro", LocalDate.of(1999,3,25));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
    
}
