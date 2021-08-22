package com.enoca.entitiy;
import javax.persistence.*;
import java.util.List;

public class Person {
    @Id
    @SequenceGenerator(name = "seq_person_name", allocationSize = 1)
    @GeneratedValue(generator = "seq_person_name",strategy = GenerationType.SEQUENCE)

    private  Long id;

    @Column(length = 500,name = "name")
    private String name;

    @Column(length = 500,name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name ="person_company_id")
    private List<Company> company_names;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}
