package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by student on 6/23/17.
 */
@Entity
public class Record {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String first;
    private String middle;
    private String last;
    private String school;
    private String skill;
    private String company;
    private String email;
    private String degree;
    private String field;
    private String yearGrad;
    private String workTitle;

    private String workDur;
    private String duty;

    private String proficiency;







    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


}
