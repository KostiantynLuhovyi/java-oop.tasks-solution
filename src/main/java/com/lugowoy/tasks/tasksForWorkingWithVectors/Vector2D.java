package com.lugowoy.tasks.tasksForWorkingWithVectors;

import java.util.Arrays;

/**
 * Created by Konstantin Lugowoy on 29.11.2018.
 */

public class Vector2D<T extends Number> {

    private static final int NUMBER_VECTOR2D_ELEMENT = 2;

    private Object[] vector;

    public Vector2D() {
        this.vector = new Object[NUMBER_VECTOR2D_ELEMENT];
    }

    public Vector2D(T[] vector) {
        this.vector = vector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector2D)) return false;
        Vector2D<?> vector2D = (Vector2D<?>) o;
        return Arrays.equals(getVector(), vector2D.getVector());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getVector());
    }

    @Override
    public String toString() {
        return "Vector2D" + Arrays.toString(vector);
    }

    public int getLengthVector() {
        return this.vector.length;
    }

    public double getLength() {
        return this.getY().doubleValue() - this.getX().doubleValue();
    }

    protected Object[] getVector() {
        return this.vector;
    }

    public void setVector(T[] vector) {
        this.vector = vector;
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        return (T) this.vector[index];
    }

    @SuppressWarnings("unchecked")
    public T getX() {
        return (T) this.vector[0];
    }

    @SuppressWarnings("unchecked")
    public T getY() {
        return (T) this.vector[1];
    }

    public void setX(T t) {
        this.vector[0] = t;
    }

    public void setY(T t) {
        this.vector[1] = t;
    }

}
