package com.lugowoy.tasks.programForCalculatingStudentRequiredFundsForLiving;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 02.11.2017. */

public class Student extends User {

    private Name name;

    private Stipend stipend;

    public Student() {
    }

    public Student(String firstName, String secondName, double amountOfStipend) {
        this.name = new Name(firstName, secondName);
        this.stipend = new Stipend(new BigDecimal(amountOfStipend));
    }

    public Student(Name name, Stipend stipend) {
        this.name = name;
        this.stipend = stipend;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new NullPointerException("null");
        }
    }

    public Stipend getStipend() {
        return stipend;
    }

    public void setStipend(Stipend stipend) {
        if (stipend != null) {
            this.stipend = stipend;
        } else {
            throw new NullPointerException("null");
        }
    }

    @Override
    public long getUserId() {
        return super.getUserId();
    }

}
