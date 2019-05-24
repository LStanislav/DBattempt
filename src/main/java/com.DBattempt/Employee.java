package com.DBattempt;


import com.sun.javafx.geom.transform.Identity;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.time.DateTimeException;
import java.util.Calendar;

@Entity
@Table(name = "emloyee")
public class Employee implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private String nationality;
    private Integer rating;
    private String description;

    @Id
    @Column(name = "ID")
    //!!!@GeneratedValue(strategy = IDENTITY) - не работает IDENTITY
    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "BIRTH_DATE")

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Column (name = "RATING")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
