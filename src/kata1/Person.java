package kata1;

import java.util.Date;

public class Person {
    private final Date birthday;
    private final String name;

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public Person(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()-birthday.getTime())/31536000000L);
    }
}
