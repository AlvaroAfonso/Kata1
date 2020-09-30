package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person persona = new Person("Álvaro", new Date(99, 2, 25));
        System.out.println(persona.getName() + " tiene " + persona.getAge());
    }
    
}
