package university.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public abstract class Person {
    @Id @GeneratedValue
    private String id;
    private String name;
    private String role;

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    abstract void register();
}
