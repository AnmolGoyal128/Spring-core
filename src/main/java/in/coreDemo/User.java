package in.coreDemo;

import org.springframework.stereotype.Component;

//@Component --> we cant directly use component as the constructor is expection the object of name and age but as there are more than 1 it gets consfused
//we didn't form any object of name and class
public class User {
    private String name;   //they are primitiives and we don't assign there values
    private int age;

    public User(String name ,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
