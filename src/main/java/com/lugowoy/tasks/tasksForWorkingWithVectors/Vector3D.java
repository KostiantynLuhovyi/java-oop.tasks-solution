package com.lugowoy.tasks.tasksForWorkingWithVectors;

/**
 * Created by Konstantin Lugowoy on 29.11.2018.
 */

public class Vector3D<T extends Number> extends Vector2D<T> {

    private static final int NUMBER_VECTOR3D_ELEMENT = 3;

    @SuppressWarnings("unchecked")
    public Vector3D() {
        super.setVector((T[]) new Object[NUMBER_VECTOR3D_ELEMENT]);
    }

    public Vector3D(T[] vector) {
        super.setVector(vector);
    }

    @SuppressWarnings("unchecked")
    public T getZ() {
        return (T) super.getVector()[3];
    }

    public void setZ(T t) {
        super.getVector()[3] = t;
    }

}
