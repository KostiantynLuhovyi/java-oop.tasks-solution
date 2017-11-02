package com.lugowoy.tasks.programForCalculatingStudentRequiredFundsForLiving;

import java.io.Serializable;
import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 02.11.2017. */

public class PlaceOfResidence implements Serializable, Cloneable {

    public static final BigDecimal PERCENTAGE_OF_MONTHLY_INCREASE_IN_COST_OF_LIVING = new BigDecimal(3);

    private int numberOfMonthsToStay;

    private BigDecimal costPlaceOfResidence;

    public PlaceOfResidence() {
    }

    public PlaceOfResidence(int numberOfMonthsToStay, BigDecimal costPlaceOfResidence) {
        this.numberOfMonthsToStay = numberOfMonthsToStay;
        this.costPlaceOfResidence = costPlaceOfResidence;
    }

    @Override
    public String toString() {
        return "PlaceOfResidence[" +
                "numberOfMonthsToStay=" + numberOfMonthsToStay +
                ", costPlaceOfResidence=" + costPlaceOfResidence +
                ']';
    }

    public int getNumberOfMonthsToStay() {
        return numberOfMonthsToStay;
    }

    public void setNumberOfMonthsToStay(int numberOfMonthsToStay) {
        if ((numberOfMonthsToStay >= 1) && (numberOfMonthsToStay <= 60)) {
            this.numberOfMonthsToStay = numberOfMonthsToStay;
        } else {
            throw new IllegalArgumentException("Incorrect number of months to stay.");
        }
    }

    public BigDecimal getCostPlaceOfResidence() {
        return costPlaceOfResidence;
    }

    public void setCostPlaceOfResidence(BigDecimal costPlaceOfResidence) {
        if (costPlaceOfResidence.equals(new BigDecimal(0))) {
            throw new IllegalArgumentException("The cost of a place of residence can not be zero");
        } else {
            this.costPlaceOfResidence = costPlaceOfResidence;
        }
    }

}
