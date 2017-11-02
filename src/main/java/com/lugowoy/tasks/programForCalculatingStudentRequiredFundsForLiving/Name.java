package com.lugowoy.tasks.programForCalculatingStudentRequiredFundsForLiving;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 02.11.2017. */

public class Name implements Serializable, Cloneable {

    private String firstName;
    private String secondName;

    public Name() {
    }

    public Name(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name can not be empty.");
        } else {
            this.firstName = firstName;
        }
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (secondName.isEmpty()) {
            throw new IllegalArgumentException("Second name can not be empty");
        } else {
            this.secondName = secondName;
        }
    }
}
