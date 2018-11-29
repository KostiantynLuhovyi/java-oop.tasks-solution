package com.lugowoy.tasks.tasksForWorkingWithVectors;

import java.math.BigDecimal;

/**
 * Created by Konstantin Lugowoy on 29.11.2018.
 */

@FunctionalInterface
public interface CalculationVector2D<T extends Number> {

    Vector2D<T> calculate(Vector2D<T> firstVector, Vector2D<T> secondVector);

    @SuppressWarnings("unchecked")
    static <T extends Number> Vector2D<T> calculateAdditionOfVectors(Vector2D<T> firstVector, Vector2D<T> secondVector) {
        Vector2D<T> result = new Vector2D<>();
        if (isEqualVectorLength(firstVector, secondVector)) {
            result.setX((T) new BigDecimal(firstVector.getX().doubleValue()).add(new BigDecimal(secondVector.getX().doubleValue())));
            result.setY((T) new BigDecimal(firstVector.getY().doubleValue()).add(new BigDecimal(secondVector.getY().doubleValue())));
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    static <T extends Number> Vector2D<T> calculateSubtractionOfVectors(Vector2D<T> firstVector, Vector2D<T> secondVector) {
        Vector2D<T> result = new Vector2D<>();
        if (isEqualVectorLength(firstVector, secondVector)) {
            result.setX((T) new BigDecimal(firstVector.getX().doubleValue()).subtract(new BigDecimal(secondVector.getX().doubleValue())));
            result.setY((T) new BigDecimal(firstVector.getY().doubleValue()).subtract(new BigDecimal(secondVector.getY().doubleValue())));
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    static <T extends Number> Vector2D<T> calculateMultiplicationOfVectors(Vector2D<T> firstVector, Vector2D<T> secondVector) {
        Vector2D<T> result = new Vector2D<>();
        if (isEqualVectorLength(firstVector, secondVector)) {
            result.setX((T) new BigDecimal(firstVector.getX().doubleValue()).multiply(new BigDecimal(secondVector.getX().doubleValue())));
            result.setY((T) new BigDecimal(firstVector.getY().doubleValue()).multiply(new BigDecimal(secondVector.getY().doubleValue())));
        }
        return result;
    }

    static <T extends Number> void incrementVector(Vector2D<T> vector2D) {
        double valueX = vector2D.getX().doubleValue() + 1;
        vector2D.setX();
    }

    static <T extends Number> void decrementVector(Vector2D<T> vector2D)

    private static <T extends Number> boolean isEqualVectorLength(Vector2D<T> firstVector, Vector2D<T> secondVector) {
        return firstVector.getLengthVector() == secondVector.getLengthVector();
    }

}
