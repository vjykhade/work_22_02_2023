package com.work22022023.springweb.entity;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class UserH2  {

    @Id
    @GeneratedValue
    private int id;
    @Size(min=3, message = "Name should contain at least 3 characters.")
    private String name;
    @Past(message = "Birthdate always in past.")
    private LocalDate birthDate;

    protected  UserH2()
    {
        //Default Contractor
    }
    public UserH2(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "UserH2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
