package com.lugowoy.tasks.programForCalculatingStudentRequiredFundsForLiving;

import java.io.Serializable;
import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 02.11.2017. */

public class Stipend implements Serializable, Cloneable {

    private BigDecimal amountOfStipend;

    public Stipend() {
    }

    public Stipend(BigDecimal amountOfStipend) {
        this.amountOfStipend = amountOfStipend;
    }

    @Override
    public String toString() {
        return "Stipend[" +
                "amountOfStipend=" + amountOfStipend +
                ']';
    }

    public BigDecimal getAmountOfStipend() {
        return amountOfStipend;
    }

    public void setAmountOfStipend(BigDecimal amountOfStipend) {
        if (amountOfStipend.equals(new BigDecimal(0))) {
            throw new IllegalArgumentException("Amount of stipend can not by zero");
        }
    }
}
