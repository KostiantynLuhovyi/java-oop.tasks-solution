package com.lugowoy.tasks.programForCalculatingStudentRequiredFundsForLiving;

import com.lugowoy.helper.generating.GeneratorDataRandomInteger;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 02.11.2017. */

public class User implements Serializable, Cloneable {

    private long userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return (int) (userId ^ (userId >>> 32));
    }

    @Override
    public String toString() {
        return "User[" +
                "userId=" + userId +
                ']';
    }

    public long getUserId() {
        return GeneratorDataRandomInteger.generateInt(0, Integer.MAX_VALUE);
    }

}
