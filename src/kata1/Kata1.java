package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person(new Date(96,3,21),"Javier");
        System.out.println(person.getName() + " tiene " + person.getAge() + " años"); 
    }
}
