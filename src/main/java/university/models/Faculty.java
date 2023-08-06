package university.models;

import jakarta.persistence.Table;

@Table(name = "faculty")
public class Faculty extends Person {
    public Faculty(String name) {
        super(name, "Faculty");
    }

    @Override
    void register() {

    }
}