package com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.determine;

import com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;

import java.util.List;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public interface DeterminableBankToBestRateForCurrencyExchange extends Determinable {

     Bank determineBankToBestRateForConcreteCurrencyExchange(List<Bank> bankList, TypeOfCurrency fromTypeOfCurrency, TypeOfCurrency inTypeOfCurrency);

}
