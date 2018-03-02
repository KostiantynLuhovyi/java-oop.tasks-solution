package com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.factory;

import com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.models.Currency;
import com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.models.TypeOfCurrency;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public interface FactoryCurrency {

    static Currency createCurrency() {
        return new Currency();
    }

    static Currency createCurrency(TypeOfCurrency typeOfCurrency) {
        return new Currency(typeOfCurrency);
    }

}
