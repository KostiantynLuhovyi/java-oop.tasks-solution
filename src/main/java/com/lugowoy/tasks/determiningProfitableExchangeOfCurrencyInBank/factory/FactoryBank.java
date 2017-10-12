package com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.factory;

import com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.model.Bank;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public interface FactoryBank {

    static Bank createBank() {
        return new Bank();
    }

    static Bank createBank(String nameBank) {
        return new Bank(nameBank);
    }

}
