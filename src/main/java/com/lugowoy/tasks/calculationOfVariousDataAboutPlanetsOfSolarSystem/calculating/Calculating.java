package com.lugowoy.tasks.calculationOfVariousDataAboutPlanetsOfSolarSystem.calculating;

import java.util.Collection;

/** Created by Konstantin Lugowoy on 07.03.2017. */

@FunctionalInterface
public interface Calculating<T, V> {

    T calculate(Collection<V> collection);

}
