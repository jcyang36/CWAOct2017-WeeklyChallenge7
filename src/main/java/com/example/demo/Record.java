package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Created by student on 6/23/17.
 */
@Entity
public class Record {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @NotNull
    @Size(min=2)
    private String first;
    @NotNull
    @Size(min=2)
    private String middle;
    @NotNull
    @Size(min=2)
    private String last;
    @NotNull
    @Size(min=2)
    private String school;
    @NotNull
    @Size(min=2)
    private String skill;
    @NotNull
    @Size(min=2)
    private String company;
    @NotNull
    @Size(min=2)
    private String email;
    @NotNull
    @Size(min=2)
    private String degree;
    @NotNull
    @Size(min=2)
    private String field;
    @NotNull
    @Size(min=2)
    private String yearGrad;
    @NotNull
    @Size(min=2)
    private String workTitle;
    @NotNull
    @Size(min=2)
    private String workDur;
    @NotNull
    @Size(min=2)
    private String duty;
    @NotNull
    @Size(min=2)
    private String proficiency;


    public Record() {
    }

    public Record(String first, String middle, String last, String school, String skill, String company, String email, String degree, String field, String yearGrad, String workTitle, String workDur, String duty, String proficiency) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.school = school;
        this.skill = skill;
        this.company = company;
        this.email = email;
        this.degree = degree;
        this.field = field;
        this.yearGrad = yearGrad;
        this.workTitle = workTitle;
        this.workDur = workDur;
        this.duty = duty;
        this.proficiency = proficiency;
    }


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


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getYearGrad() {
        return yearGrad;
    }

    public void setYearGrad(String yearGrad) {
        this.yearGrad = yearGrad;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getWorkDur() {
        return workDur;
    }

    public void setWorkDur(String workDur) {
        this.workDur = workDur;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }




}
