package com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory;

import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class OptionFactory extends ModelFactory<Option> {

    @Override
    public Option createModel() {
        return new Option();
    }

}
