package com.lugowoy.tasks.calculationOfAmountOfPaintNeededToPaintRoom.factory;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

@FunctionalInterface
public interface Factory<T> {

    T create();

}
