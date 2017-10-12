package com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.factory;

/** Created by Konstantin Lugowoy on 09.03.2017. */

@FunctionalInterface
public interface Factory<T> {

    T create();

}
